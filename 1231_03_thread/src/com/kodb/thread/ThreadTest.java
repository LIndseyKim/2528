package com.kodb.thread;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("main start..");
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		MyRunnable r = new MyRunnable(); //�ϰŸ�
		Thread t3 = new Thread(r);	     //�ϲ� 
		t3.start();
		
		t1.start();
		t2.start(); //�̱� thread run �� ���ϸ� thread�� ���°� �ƴϴ�.start �� �����	
		System.out.println("main start..");
	}

}
