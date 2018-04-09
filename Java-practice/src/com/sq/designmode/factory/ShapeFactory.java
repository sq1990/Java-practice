package com.sq.designmode.factory;

/**
 * <b>文件名：ShapeFactory <b>功能描述：</b>TODO<br>
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月9日 上午9:26:09
 * @version 1.0
 */
public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
