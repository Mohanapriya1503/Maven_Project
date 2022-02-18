package com.Mavenproject;

public class Pojo_ClassB {

	public static void main(String[] args) {
		
		Pojo_ClassA p=new Pojo_ClassA();
		
		int a=p.getA();
		
		System.out.println(a);
	
	    p.setA(20);
	
	    int a2 =p.getA();
	    
	    System.out.println(a2);
	
}
}
