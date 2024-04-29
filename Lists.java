package com.chainsys.practicingtask;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Lists {

	public static void main(String[] args) {
		
//ArrayList
		ArrayList li = new ArrayList<>();
		ArrayList li1 = new ArrayList<>();
		li.add("Apple");
		li.add("Banana");
		li.add("Orange");
		li.add(2);
		li.add(2,"Papaya");
		System.out.println(li + " ");
		System.out.println(li.get(0));
		li.remove("Banana");
		System.out.println(li + " ");
		
		li1.add(22);
		li1.add("Naveen");
		
		li.addAll(li1);
		System.out.println("----------"+ li);

//LinkedList
		
		List numbers = new LinkedList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add("Helo");
		numbers.add(3);
		numbers.add(2,"Hi");
		numbers.add(5);
		System.out.println(numbers + " ");
		System.out.println(numbers.get(0));
		 numbers.remove(Integer.valueOf(5));
		 System.out.println(numbers + " ");
		 System.out.println("Size: " + numbers.size());
		 numbers.remove(1);
		 System.out.println(numbers + " ");
	}

}
