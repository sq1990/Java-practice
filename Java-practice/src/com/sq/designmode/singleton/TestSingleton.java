package com.sq.designmode.singleton;

public class TestSingleton extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "  hello world!");
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
	}

	public static void main(String[] args) {
		TestSingleton test1 = new TestSingleton();
		test1.start();

		TestSingleton test2 = new TestSingleton();
		test2.start();

		TestSingleton test3 = new TestSingleton();
		test3.start();

	}

}
