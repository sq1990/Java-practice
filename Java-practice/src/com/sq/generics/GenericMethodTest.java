package com.sq.generics;

/**
 * <b>文件名：GenericMethodTest <b>功能描述：泛型方法 Java泛型
 * 
 * 泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。
 * 
 * @author 宋强 591036149@qq.com
 * @date 2018年4月13日 上午9:15:56
 * @version 1.0
 */
// 你可以写一个泛型方法，该方法在调用时可以接收不同类型的参数。根据传递给泛型方法的参数类型，编译器适当地处理每一个方法调用。
public class GenericMethodTest {

	/**
	 * 泛型方法printArray
	 * 
	 * @param inputArray
	 */
	public static <T> void printArray(T[] inputArray) {
		for (T element : inputArray) {
			System.out.printf("%s ", element);
		}
	}
	/**
	 * 有界的类型参数:
	 * 可能有时候，你会想限制那些被允许传递到一个类型参数的类型种类范围。例如，一个操作数字的方法可能只希望接受Number或者Number子类的实例。这就是有界类型参数的目的。
	       要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。
	 * @param x
	 * @param z
	 * @return
	 */
	//  比较三个值并返回最大值
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // 假设x是初始最大值
		if (y.compareTo(max) > 0) {
			max = y; // y 更大
		}
		if (z.compareTo(max) > 0) {
			max = z; // 现在 z 更大
		}
		return max; // 返回最大对象
	}

	public static void main(String[] args) {
		// 创建不同类型数组： Integer, Double 和 Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("整型数组元素为:");
		printArray(intArray); // 传递一个整型数组

		System.out.println("\n双精度型数组元素为:");
		printArray(doubleArray); // 传递一个双精度型数组

		System.out.println("\n字符型数组元素为:");
		printArray(charArray); // 传递一个字符型数组
		System.out.println("**************");
		
		System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n", 3, 4, 5, maximum(3, 4, 5));
		System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
		System.out.printf("%s, %s 和 %s 中最大的数为 %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
	}
}
