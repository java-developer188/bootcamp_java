package com.bootcamp.learning.threads;

public class ThreadPlayGround {

	public static void main(String[] args) {
		
		for(int num = 1; num <=3 ; num ++) {
			MyThread thread = new MyThread(num);
			thread.start();
		}
		System.out.println("main thread ended");
		
		for(int num = 1; num <=3 ; num ++) {
			MyRunnable runnable = new MyRunnable(num);
			Thread thread = new Thread(runnable);
			thread.start();
		}
		System.out.println("main thread ended");
		
		
		for(int num = 1; num <=3 ; num ++) {
			int x = num;
			Thread thread = new Thread(()->{for(int i = 1 ; i <=5 ;i++) {
				System.out.println(i +"- from Thread:"+x);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}});
			thread.start();
		}
		System.out.println("main thread ended");
		
	}
}
