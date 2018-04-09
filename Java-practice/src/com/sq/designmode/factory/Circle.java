package com.sq.designmode.factory;

/**
 * <b>文件名：Circle <b>功能描述：</b>TODO<br>
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月9日 上午9:25:42
 * @version 1.0
 */
public class Circle implements Shape {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sq.designmode.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
