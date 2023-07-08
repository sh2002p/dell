package com.rays.thread;

public class TestHelloNoThread {
	
	public static void main(String[] args) {
		
		HelloNoThread t1 = new HelloNoThread("bittu");
		HelloNoThread t2 = new HelloNoThread("shradha");
		
		t1.run();
		t2.run();
		
	}

}
