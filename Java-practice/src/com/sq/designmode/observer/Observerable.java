package com.sq.designmode.observer;

/**
 * <b>文件名：Observerable 抽象被观察者接口 声明了添加、删除、通知观察者方法
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月16日 上午9:29:28
 * @version 1.0
 */
public interface Observerable {

	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObserver();
}
