package com.bootcamp.learning.threads;

public class MyThread extends Thread {
	int identifier;
	

	protected MyThread(int identifier) {
		super();
		this.identifier = identifier;
	}


	@Override
	public void run() {
		for(int i = 1 ; i <=5 ;i++) {
			System.out.println(i +"- from Thread:"+identifier);
//			if(identifier ==2 && i==3) {
//				throw new RuntimeException();
//			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	

}
