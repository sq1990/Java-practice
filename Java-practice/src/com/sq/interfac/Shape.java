package com.sq.interfac;

/**
 * <b>文件名：Shape <b>功能描述：接口学习
 * 
 * 
 * 1 除非实现接口的类是抽象类，否则该类要定义接口中的所有方法。
 * 接口的特性：
 * 1 接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract（只能是 public abstract，其他修饰符都会报错）。
 * 2 接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量（并且只能是 public，用 private 修饰会报编译错误）。
 * 接口与类的区别：
 * 1 接口支持多继承
 * 2 接口中所有的方法必须是抽象方法。
 * 3 接口不能用于实例化对象
 * 抽象类和接口的区别:
 * 1 抽象类中的方法可以有方法体，就是能实现方法的具体功能，但是接口中的方法不行
 * 2 抽象类中的成员变量可以是各种类型的，而接口中的成员变量只能是 public static final 类型的
 * 3 接口中不能含有静态代码块以及静态方法(用 static 修饰的方法)，而抽象类是可以有静态代码块和静态方法。
 * 4 一个类只能继承一个抽象类，而一个类却可以实现多个接口。
 */
public interface Shape extends Extends1,Extends2{
	int params = 1;
	
	void draw();

	public void add();
}
