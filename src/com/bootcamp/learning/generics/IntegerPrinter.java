package com.bootcamp.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class IntegerPrinter {

	Integer item;
	
	public void  print() {
		System.out.println(item);
	}
	
	public <T,K> List<K>  anyPrint(List<T> num,K lo) {
		List<K> mylist = new ArrayList<>();
		mylist.add( (K) new Float(2.99f));
		return mylist;
	}

	public  IntegerPrinter(Integer item) {
		this.item = item;
	}
}
