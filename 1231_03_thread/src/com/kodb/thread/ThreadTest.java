package com.kodb.thread;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("main start..");
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		MyRunnable r = new MyRunnable(); //일거리
		Thread t3 = new Thread(r);	     //일꾼 
		t3.start();
		
		t1.start();
		t2.start(); //싱글 thread run 을 콜하면 thread를 쓰는게 아니다.start 를 써야함	
		System.out.println("main start..");
	}

}
