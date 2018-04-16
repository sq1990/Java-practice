package com.sq.designmode.observer;

/**
 * <b>文件名：Test <b>功能描述：</b>TODO<br>
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月16日 上午9:37:24
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		WechatServer server = new WechatServer();
		Observer userZhang = new User("ZhangSan");
		Observer userLi = new User("LiSi");
		Observer userWang = new User("WangWu");
		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setInfomation("PHP是世界上最好用的语言！");
		System.out.println("----------------------------------------------");
		server.removeObserver(userZhang);
		server.setInfomation("JAVA是世界上最好用的语言！");
	}

}
