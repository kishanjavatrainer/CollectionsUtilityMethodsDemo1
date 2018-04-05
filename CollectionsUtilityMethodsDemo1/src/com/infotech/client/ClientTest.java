package com.infotech.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		List<String> personList = new ArrayList<>();
		personList.add("Sam");
		personList.add("Andy");
		personList.add("Sean");
		personList.add("Jash");
		personList.add("Amy");
		personList.add("Martin");
		personList.add("Joseph");
		personList.add("Amy");

		System.out.println("Original List " + personList);

		Collections.sort(personList);
		System.out.println("Sorted alphabetically List " + personList);

		Collections.reverse(personList);
		System.out.println("Reverse List " + personList);
		Collections.shuffle(personList);
		System.out.println("Shuffled List " + personList);
		System.out.println("Checking occurance of Amy: "+ Collections.frequency(personList, "Amy"));
		
	}
}
