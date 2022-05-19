package test;

import selenium.Test4;

public class Test1 {
	//static Test1 t3 = new Test1();
	static test2 t1 = new test2();
	static Test3 t5=new Test3();
	static Test4 t7=new Test4();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t3 = new Test1();
		
	
		System.out.println("i am in main method");
		
		printMe();
		System.out.println("after printMe method");
		scanMe();
		t3.testMe();
		test2.red();
		t1.blue();
Test3.dell();
Test3.mac();

	}
	public static void printMe() {
		System.out.println("print me method");
	}
public static void scanMe() {
	System.out.println("scan me");
}
public void testMe() {
	System.out.println("tets me");
}
}
