package com.sq.Singleton;

/**
 * 线程安全的单例模式 <b>文件名：Singleton <b>功能描述：</b>TODO<br>
 * 
 * @author 宋强 591036149@qq.com
 * @date 2017年6月16日 下午4:46:28
 * @version 1.0
 */
public class Singleton {
	private static Singleton instance;

	public Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
