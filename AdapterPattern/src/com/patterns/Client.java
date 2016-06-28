package com.patterns;

public class Client {
	public static void main(String args[])
	{
		Target targetObject = new Adapter();
		targetObject.doThis();
	}

}
