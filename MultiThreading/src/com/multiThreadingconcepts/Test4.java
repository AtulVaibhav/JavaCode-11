package com.multiThreadingconcepts;

class T4 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"----->"+i);
		}
	}
}


public class Test4 {

	public static void main(String[] args) {
		T4 t = new T4();
		T4 t1 = new T4();
		
		t.setName("A");
		t1.setName("B");
		
		t.start();
		t1.start();

	}

}
