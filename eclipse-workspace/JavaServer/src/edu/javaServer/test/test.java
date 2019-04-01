package edu.javaServer.test;

public class test extends Thread {
	public void run() {
		while(true) {
			System.out.print("A");
		}
	}
	public static void main(String[] args) {
		test test = new test();
		test.start();
		while(true) {
			System.out.print(".");
		}
	}
}
