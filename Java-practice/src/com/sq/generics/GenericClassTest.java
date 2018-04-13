package com.sq.generics;

/**
 * <b>文件名：GenericClassTest <b>功能描述：泛型类
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月13日 上午9:28:27
 * @version 1.0
 */
public class GenericClassTest<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		
		GenericClassTest<Integer> integerBox = new GenericClassTest<Integer>();
		GenericClassTest<String> stringBox = new GenericClassTest<String>();

		integerBox.add(new Integer(10));
		stringBox.add(new String("菜鸟教程"));

		System.out.printf("整型值为 :%d\n\n", integerBox.get());
		System.out.printf("字符串为 :%s\n", stringBox.get());
	}
}
