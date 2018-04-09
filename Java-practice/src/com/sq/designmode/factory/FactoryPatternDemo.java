package com.sq.designmode.factory;

/**
 * <b>文件名：FactoryPatternDemo <b>功能描述：</b>TODO<br>
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月9日 上午9:27:03
 * @version 1.0
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		// 获取 Circle 的对象，并调用它的 draw 方法
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		// 调用 Circle 的 draw 方法
		shape1.draw();

		// 获取 Rectangle 的对象，并调用它的 draw 方法
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// 调用 Rectangle 的 draw 方法
		shape2.draw();

		// 获取 Square 的对象，并调用它的 draw 方法
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// 调用 Square 的 draw 方法
		shape3.draw();
	}
}
