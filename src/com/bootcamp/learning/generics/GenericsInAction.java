package com.bootcamp.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInAction {

	public static void main(String[] args) {
		IntegerPrinter oldPrinter = new IntegerPrinter(188);
		oldPrinter.print();
		List<Integer> dates = oldPrinter.anyPrint(new ArrayList<Integer>(),7);
		Integer x = dates.get(0);
		Printer<Integer> intPrinter = new Printer<>(1);
		intPrinter.print();
		Printer<String> stringPrinter = new Printer<>("Haider");
		stringPrinter.print();
		Printer<Double> doublePrinter = new Printer<>(2.34);
		doublePrinter.print();
		
	}
}
