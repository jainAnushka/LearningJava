package com.patterns;

public class Adapter implements Target {
	Adaptee obj = new Adaptee();
	Adapter()
	{
		System.out.println("bye");
	}
	public void doThis(){
		obj.doThat("hi");	
	}

}
