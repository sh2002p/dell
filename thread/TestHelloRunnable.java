package com.rays.thread;

public class TestHelloRunnable {
	
	public static void main(String[] args) {
		
	Thread t1 = new Thread(new HelloRunnable("shradha"));
	Thread t2 = new Thread(new HelloRunnable("bittu"));
	
	t1.start();
	t2.start();
	
	
	for(int i = 0; i <50; i++) {
		System.out.println("main");

}
	}}