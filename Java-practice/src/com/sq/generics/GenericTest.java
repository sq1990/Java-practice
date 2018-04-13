package com.sq.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>文件名：GenericTest 
	1 类通配符 类型通配符一般是使用?代替具体的类型参数。例如 List<?> 在逻辑上是List
	2 类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型
 * <String>,List<Integer> 等所有List<具体类型实参>的父类。
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月13日 上午9:41:23
 * @version 1.0
 */
public class GenericTest {
	//1、类型通配符一般是使用?代替具体的类型参数。例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类。
	public static void getData(List<?> data) {
		System.out.println("data :" + data.get(0));
	}
	//2 类型通配符上限通过形如List来定义，如此定义就是通配符泛型只接受Number及其下层子类类型
	public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
     }
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		List<Integer> age = new ArrayList<Integer>();
		List<Number> number = new ArrayList<Number>();

		name.add("icon");
		age.add(18);
		number.add(314);

		getData(name);
		getData(age);
		getData(number);
		
		
		//getUperNumber(name);//1
        getUperNumber(age);//2
        getUperNumber(number);//3

	}

}
