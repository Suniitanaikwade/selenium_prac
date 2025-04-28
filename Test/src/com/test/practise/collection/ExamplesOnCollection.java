package com.test.practise.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExamplesOnCollection {
	
	public static void main(String[] args) {
		List<String>newlist= new ArrayList<String>();
		
		
		newlist.add("opr");
		newlist.add("abc");
		newlist.add("abc");
		newlist.add("abc");
		newlist.add("jkl");
		newlist.add("def");
		newlist.add("lmn");
		newlist.add("ghi");
		
		
		
		//newlist.remove(1);
		newlist.add(2, "xyz");
		
		Set newset= new  TreeSet(newlist);
		
		for (Object object : newset) {
			System.out.println(object);
		}
		
		
		
	}

}
