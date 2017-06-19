package com.sq.testclass;

/**
 * <b>�ļ�����TestClass <b>����������</b>��������.class<br>
 * 
 * @author ��ǿ 591036149@qq.com
 * @date 2017��6��15�� ����8:59:33
 * @version 1.0.
 */
public class TestClass {

	/*
	 * 1.����.class ˵���� JVM��ʹ����װ����, ����װ���ڴ�(ǰ����:�໹û��װ���ڴ�),������ĳ�ʼ������.����Class�Ķ���
	 * 2.Class.forName("�����ַ���") ��ע�������ַ����ǰ���+������ ˵����װ����,������ľ�̬��ʼ��������Class�Ķ���
	 * 3.ʵ������.getClass()
	 * ˵����������о�̬��ʼ�����Ǿ�̬��ʼ������������o����ʱ������ָ�Ķ���(��Ϊ:�Ӷ�������ÿ��ܻḳ������������ñ�����)���������Class�Ķ���
	 */
	public static void main(String[] args) {
		try {

			System.out.println("***************start***************");
			// ����.class
			Class testTypeClass = TestClassType.class;
			System.out.println("testTypeClass---" + testTypeClass);
			// ����Class.forName()
			Class testTypeForName = Class.forName("com.sq.testclass.TestClassType");
			System.out.println("testTypeForName---" + testTypeForName);
			// ����Object.getClass()
			TestClassType testTypeGetClass = new TestClassType();
			System.out.println("testTypeGetClass---" + testTypeGetClass.getClass());
			System.out.println("***************end***************");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		/*���ݽ�����Է��֣��������ɵ�Class����һ���ġ����ҳ���ֻ��ӡһ�Ρ���̬�Ĳ�����ʼ������ 
		����֪������̬�ķ������Գ�ʼ�������ڼ������ʱ���ʼ�������Ǿ�̬�������Գ�ʼ������new��ʵ�������ʱ����ء�
		��ˣ���γ���˵�������ַ�ʽ����Class������ʵֻ��һ��Class����������Class�����ʱ�������ж��ڴ����Ƿ��Ѿ����ء�
		���ԣ�����Class����Ĺ�����ʵ����˵ģ�
		�����Ǳ�дһ���µ�java��ʱ,JVM�ͻ�����Ǳ����class����,�����ͬ����.class�ļ��С�������ʱ������Ҫ���������Ķ���JVM�ͻ�������Ƿ��Ѿ�װ���ڴ��С�����û��װ�أ����.class�ļ�װ�뵽�ڴ��С�����װ�أ������class�ļ�����ʵ������
		 */
	}
}
