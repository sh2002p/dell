package com.rays.thread;

public class HelloRunnable implements Runnable{
	
	String name = null;
	
	public HelloRunnable(String n) {
		name = n;

}
	public void run() {
		for(int i = 0; i <10; i++) {
			System.out.println(i + name);
		}
}}