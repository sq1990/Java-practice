package com.sq.designmode.observer;

/**
 * <b>文件名：User 观察者
 * 实现了update方法
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月16日 上午9:36:05
 * @version 1.0
 */
public class User implements Observer {
	private String name;
	private String message;

	public User(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sq.designmode.observer.Observer#update(java.lang.String)
	 */
	@Override
	public void update(String message) {
		this.message = message;
		read();
	}

	public void read() {
		System.out.println(name + " 收到推送消息： " + message);
	}

}
