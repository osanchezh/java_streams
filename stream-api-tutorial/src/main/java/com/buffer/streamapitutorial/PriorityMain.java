package com.buffer.streamapitutorial;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityMain {
  public static void main(String args[]) {
	  PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
	  pq.add(1);
	  pq.add(2);
	  pq.add(3);
	  pq.add(4);
	  pq.add(5);
	  pq.add(6);
	  pq.add(7);
	  pq.add(8);
	  pq.add(9);
	  pq.add(10);
	  System.out.println(pq);
	  System.out.println(pq.poll());
	  System.out.println(pq);
	  
	  PriorityQueue<Integer> pq1= 
			  new PriorityQueue<Integer>(Comparator.reverseOrder());
	  
	  pq1.add(1);
	  pq1.add(2);
	  pq1.add(3);
	  pq1.add(4);
	  pq1.add(5);
	  pq1.add(6);
	  pq1.add(7);
	  pq1.add(8);
	  pq1.add(9);
	  pq1.add(10);
	  System.out.println(pq1);
	  
	  Queue<Customer> qc =new PriorityQueue<>(new CustomerOrder());
	  qc.add(new Customer(6,2.0,"a"));
	  qc.add(new Customer(1,1.0,"b"));
	  qc.add(new Customer(4,8.0,"c"));
	  System.out.println(qc.poll());
	  System.out.println(qc.poll());
	  System.out.println(qc.poll());
	  System.out.println("1".hashCode());
	  System.out.println("1".hashCode());
  }
  
}
