package org.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hello {

    public static void main(String[] args) {

	System.out.println("Hello World");
	List<String> li = new ArrayList<>();
	li.add("a");
	li.add("b");
	li.add("c");
	li.add("d");
	li.add("e");
	// Iterate by using iterator
	Iterator<String> iterator = li.iterator();
	while (iterator.hasNext()) {
	    String string = iterator.next();
	    System.out.println(string);
	}
    }

}
