package com.multiThreadingconcepts;

class ChildThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Child thread started");
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"------>"+i);
		}
		System.out.println(Thread.currentThread().getName()+" Child thread completed");	
	}
}

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread started..");
		ChildThread ch = new ChildThread();
		ch.start();
		ch.join();
		
		ChildThread ch1 = new ChildThread();
		ch1.start();
		ch1.join();
		for(int i=11;i<=15;i++){
			System.out.println(Thread.currentThread().getName()+"------->"+i);
		}
		System.out.println("main thread completed..");

	}

}
