package com.multiThreadingconcepts;

class Table {
	public synchronized void printTable(int num) {
		try {
			System.out.println(Thread.currentThread().getName() + " started and acquire the lock");
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));

				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " completed and release the lock");
	}
}

class Child1 extends Thread {
	private Table table;

	Child1(Table table) {
		this.table = table;

	}

	public void run() {
		this.table.printTable(2);
	}
}

class Child2 extends Thread {
	private Table table;

	Child2(Table table) {
		this.table = table;

	}

	public void run() {
		this.table.printTable(5);
	}
}

public class Test7 {

	public static void main(String[] args) {
		Table table = new Table();
		Child1 child = new Child1(table);
		Child2 child2 = new Child2(table);

		child.start();
		child2.start();

	}

}
