package com.collections;

import java.util.*;

public class PracticeArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> nums = new ArrayList<Integer>(3);
		for (int i = 0; i < 5; i++) {
			nums.add(i);
		}

		for (Integer i : nums) {
			System.out.println(i);
		}

		ArrayList<Integer> anotherNums = new ArrayList<Integer>();
		int[] arr = new int[10];
		System.out.println(arr.getClass());
		anotherNums.add(0);
		anotherNums.addAll(1, nums);
		System.out.println(anotherNums);
		nums.clear();
		System.out.println(anotherNums);
		System.out.println(nums);
		System.out.println(anotherNums.lastIndexOf(1));
		System.out.println(anotherNums.lastIndexOf(5));
		anotherNums.trimToSize();
		anotherNums.add(2);
		System.out.println(anotherNums);
//		anotherNums.sort(new MyComparator());
		System.out.println(anotherNums);
		System.out.println(anotherNums.getClass());
		int[] a = anotherNums.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(anotherNums.stream().filter(i -> i != null).mapToInt(i -> i).max());
		int u = Integer.MIN_VALUE;
// 		System.out.println(Math.min());

		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(1, 2));
		bookList.add(new Book(2, 4));
		Book b = new Book(4, 5);
		try {
			Book c = (Book) b.clone();
			System.out.println("c" + c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while cloning");
		}
		System.out.println(b);
		ArrayList<Book> clonedList = bookList;
		bookList.get(0).category = 5;
		System.out.println(clonedList.get(0).toString());
// 		clonedList.clear();
// 		clonedList.set(0, 1);
		Integer aik = Integer.valueOf(5).intValue();
		System.out.println("After Updating");
		System.out.println(anotherNums);
		HashSet<Integer> hi = new HashSet<Integer>();
		LinkedHashSet<Integer> lhi = new LinkedHashSet<Integer>();
		lhi.add(null);
		lhi.add(null);
		hi.add(null);
		hi.add(5);
		TreeSet<Integer> ts = new TreeSet(anotherNums);

		ts.forEach(i -> {
			System.out.println(i);
		});

		hi.forEach(i -> {
			System.out.println(i);
		});

		lhi.forEach(i -> {
			System.out.println(i);
		});

// 		anotherNums.cl

	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 == o2) {
			return 0;
		} else if (o1 > o2) {
			return 1;
		} else {
			return -1;
		}
	}

}
class Library{
	final int i=10;
//	i = 10;
	public void x() {
		
	}
	
	
}


class Book extends Library implements Cloneable {
	public int category;
	public int price;

	public Book(int category, int price) {
		this.category = category;
		this.price = price;
	}
	
	public final void x() {
		
	}
	

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "" + this.price + this.category;
	}

	public static void test() {
	}

	public static void test(int p) {
	}
}
