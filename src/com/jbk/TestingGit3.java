package com.jbk;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Aurangabad");
		al.add("Nagpur");
		Iterator<String> itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
