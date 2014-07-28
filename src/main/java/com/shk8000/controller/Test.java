package com.shk8000.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.shk8000.pojo.Person;

public class Test {
	
//	@Autowired
//	private Person cp;
//	
//	public void print(){
//		String result = cp.sayHello("shk");
//		System.out.println(result);
//	}
	
	public static void main(String[] args){
		A aa = new B();
	}
	
	public String reverseWords(String s){
		
		return null;
	}

}


class A {
	public A(){
		System.out.println("A .........");
		getC();
	}
	public void getC(){
		System.out.println("Atest");
		getW();
	}
	public void getW(){
		System.out.println("Atestqqqq");
	}
}

class B extends A{
	public B(){
		System.out.println("B .........");
	}
	public void getA(){
		System.out.println("Btest");
	}
	public void getW(){
		System.out.println("Btestqqqq");
	}
}