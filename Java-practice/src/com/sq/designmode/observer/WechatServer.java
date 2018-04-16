package com.sq.designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>文件名：WechatServer 被观察者，也就是微信公众号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月16日 上午9:31:50
 * @version 1.0
 */
public class WechatServer implements Observerable {

	// 注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
	private List<Observer> list;
	private String message;

	public WechatServer() {
		list = new ArrayList<Observer>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sq.designmode.observer.Observerable#registerObserver(com.sq.
	 * designmode.observer.Observer)
	 */
	@Override
	public void registerObserver(Observer o) {
		list.add(o);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sq.designmode.observer.Observerable#removeObserver(com.sq.designmode.
	 * observer.Observer)
	 */
	@Override
	public void removeObserver(Observer o) {
		if (!list.isEmpty())
			list.remove(o);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sq.designmode.observer.Observerable#notifyObserver()
	 */
	@Override
	public void notifyObserver() {
		for (Observer observer : list) {
			observer.update(message);
		}
	}

	public void setInfomation(String s) {
		this.message = s;
		System.out.println("微信服务更新消息： " + s);
		// 消息更新，通知所有观察者
		notifyObserver();
	}

}
