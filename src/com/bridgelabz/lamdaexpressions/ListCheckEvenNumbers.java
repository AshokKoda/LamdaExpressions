package com.bridgelabz.lamdaexpressions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ListCheckEvenNumbers {

	List<Integer> myList;

	public ListCheckEvenNumbers() {
		myList = new LinkedList<>();

		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 90 + 10);
			myList.add(randomNum);
		}

	}

	public static void main(String[] args) {
		ListCheckEvenNumbers li = new ListCheckEvenNumbers();

		System.out.println("---printing list obj----");
		System.out.println(li.myList);

		Iterator<Integer> intItr = li.myList.iterator();
		System.out.println("-----printing list elements with iterator----");
		while (intItr.hasNext()) {
			int num = intItr.next();
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

		System.out.println("---Checking even number with Predict---");

		Predicate<Integer> isEven = n -> n % 2 == 0;

		li.myList.forEach(n -> {
			if (isEven.test(n)) {
				System.out.println(n);
			}
		});
	}

}
