package com.buffer.streamapitutorial;

import java.util.ArrayDeque;

public class ArrayQueueMain {

	public static void main(String[] args) {
   ArrayDeque<String> aq = new ArrayDeque<String>();
   aq.push("v");
   aq.push("f");
   aq.push("g");
   String pop= aq.pop();
   System.out.println(pop);
   System.out.println(aq);
   
   ArrayDeque<String> aq1 = new ArrayDeque<String>();
   aq1.offer("v");
   aq1.offer("f");
   aq1.offer("g");
   String pop1= aq1.pop();
   System.out.println(pop1);
   System.out.println(aq1);
   
	}

}
