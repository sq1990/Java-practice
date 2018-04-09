package com.sq.abstrac;

/**
 * <b>文件名：Employee <b>功能描述：抽象类
 * 
 * 1 抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。
 * 2 由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。
 * 
 * 
 * 3 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
 * 4 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能
 * 5 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类
 */
public abstract class EmployeeAbstract {
	private String name;
	private String address;
	private int number;

	public abstract void add();
	
	public EmployeeAbstract(String name, String address, int number) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
}
