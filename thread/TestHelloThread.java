package com.rays.thread;

public class TestHelloThread {
	
	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread("bittu");
		HelloThread t2 = new HelloThread("Shradha");
		
		t1.start();
		t2.start();
		
	
	}
	

}
