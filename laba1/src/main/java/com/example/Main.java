package com.example;

public class Main {
	public static void main(String[] args) {
		String str = "abcdef";
		Cryptographer cg = new Cryptographer(new Cessar5());
		cg.execute(str);
	}
}
