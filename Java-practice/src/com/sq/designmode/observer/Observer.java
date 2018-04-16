package com.sq.designmode.observer;

/**
 * <b>文件名：Observer 抽象观察者接口
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月16日 上午9:30:36
 * @version 1.0
 */
public interface Observer {

	public void update(String msg);
}
