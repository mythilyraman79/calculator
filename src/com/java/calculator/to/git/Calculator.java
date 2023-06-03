package com.java.calculator.to.git;

public class Calculator {
	public static void add(int a, int b) {
		System.out.println("add: "+(a+b));
	}
	public static void sub(int a, int b) {
		System.out.println("sub: "+(b-a));
	}
	public static void mul(int a, int b) {
		System.out.println("mul: "+(a*b));
	}
	public static void div(int a, int b) {
		System.out.println("div: "+(a/b));
	}
	public static void main(String[] args) {
		add(10,20);
		sub(30,60);
		mul(10,30);
		div(100,10);
	}
}
