package com.sq.testclass;

/**
 * <b>文件名：TestClassType <b>功能描述：</b>TODO<br>
 * 
 * @author 宋强 591036149@qq.com
 * @date 2017年6月15日 上午9:03:01
 * @version 1.0
 */
public class TestClassType {
	// 构造函数
	public TestClassType() {
		System.out.println("----构造函数---");
	}

	// 静态的参数初始化
	static {

		System.out.println("---静态的参数初始化---");

	}
	// 非静态的参数初始化
	{
		System.out.println("----非静态的参数初始化---");
	}

}
