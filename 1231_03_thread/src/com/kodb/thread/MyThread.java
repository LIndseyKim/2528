package com.kodb.thread;

public class MyThread extends Thread {

	
	public void run(){
		for(int i=1;i<=10;++i){
			System.out.println(Thread.currentThread().getName()+":"+i);
			
			try {
				Thread.sleep(1000);			//�纸�� 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1000���� 1�� �ϱ� 1000 = 1�� 
			
			
		}
	}
	
}
