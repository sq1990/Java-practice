package com.sq.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <b>文件名：Java8Test <b>功能描述：Java8新特性
 * 
 * @author 宋强 591036149@qq.com
 * @date 2017年6月21日 上午8:08:19
 * @version 1.0
 */
public class Java8Test {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
		names1.add("Google ");
		names1.add("Runoob ");
		names1.add("Taobao ");
		names1.add("Baidu ");
		names1.add("Sina ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Google ");
		names2.add("Runoob ");
		names2.add("Taobao ");
		names2.add("Baidu ");
		names2.add("Sina ");

		Java8Test tester = new Java8Test();
		System.out.println("使用 Java 7 语法: ");

		tester.sortUsingJava7(names1);
		System.out.println(names1);
		System.out.println("使用 Java 8 语法: ");

		tester.sortUsingJava8(names2);
		System.out.println(names2);
	}

	public void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});
	}

	public void sortUsingJava8(List<String> names) {
		Collections.sort(names, (o1, o2) -> o1.compareTo(o2));
	}
}
