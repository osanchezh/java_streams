package com.buffer.streamapitutorial;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1,2);
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(34);
		println(lst);

	}

	public static <T,U>T print(T t, U u){
		System.out.println(t);
		return t;
	}
	
	public static void println(List<? extends Number> lst) {
		System.out.println(lst);
	}

}
