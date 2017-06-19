package com.sq.testclass;

/**
 * <b>文件名：TestClass <b>功能描述：</b>测试类名.class<br>
 * 
 * @author 宋强 591036149@qq.com
 * @date 2017年6月15日 上午8:59:33
 * @version 1.0.
 */
public class TestClass {

	/*
	 * 1.类名.class 说明： JVM将使用类装载器, 将类装入内存(前提是:类还没有装入内存),不做类的初始化工作.返回Class的对象
	 * 2.Class.forName("类名字符串") （注：类名字符串是包名+类名） 说明：装入类,并做类的静态初始化，返回Class的对象
	 * 3.实例对象.getClass()
	 * 说明：对类进行静态初始化、非静态初始化；返回引用o运行时真正所指的对象(因为:子对象的引用可能会赋给父对象的引用变量中)所属的类的Class的对象
	 */
	public static void main(String[] args) {
		try {

			System.out.println("***************start***************");
			// 测试.class
			Class testTypeClass = TestClassType.class;
			System.out.println("testTypeClass---" + testTypeClass);
			// 测试Class.forName()
			Class testTypeForName = Class.forName("com.sq.testclass.TestClassType");
			System.out.println("testTypeForName---" + testTypeForName);
			// 测试Object.getClass()
			TestClassType testTypeGetClass = new TestClassType();
			System.out.println("testTypeGetClass---" + testTypeGetClass.getClass());
			System.out.println("***************end***************");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		/*根据结果可以发现，三种生成的Class对象一样的。并且程序只打印一次“静态的参数初始化”。 
		我们知道，静态的方法属性初始化，是在加载类的时候初始化。而非静态方法属性初始化，是new类实例对象的时候加载。
		因此，这段程序说明，三种方式生成Class对象，其实只有一个Class对象。在生成Class对象的时候，首先判断内存中是否已经加载。
		所以，生成Class对象的过程其实是如此的：
		当我们编写一个新的java类时,JVM就会帮我们编译成class对象,存放在同名的.class文件中。在运行时，当需要生成这个类的对象，JVM就会检查此类是否已经装载内存中。若是没有装载，则把.class文件装入到内存中。若是装载，则根据class文件生成实例对象。
		 */
	}
}
