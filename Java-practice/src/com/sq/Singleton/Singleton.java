package com.sq.Singleton;

/**
 * �̰߳�ȫ�ĵ���ģʽ <b>�ļ�����Singleton <b>����������</b>TODO<br>
 * 
 * @author ��ǿ 591036149@qq.com
 * @date 2017��6��16�� ����4:46:28
 * @version 1.0
 */
public class Singleton {
	private static Singleton instance;

	public Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
