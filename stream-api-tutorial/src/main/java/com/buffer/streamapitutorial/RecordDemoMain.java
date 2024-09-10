package com.buffer.streamapitutorial;

public class RecordDemoMain {

	public static void main(String[] args) {
		StudentClass sc= new StudentClass("a","b");
		System.out.println(sc);
		
		StudentRecord studentRecord = new StudentRecord("c","d");
		System.out.println(studentRecord);
		System.out.println(studentRecord.name());
		StudentRecord.print();

	}

}
