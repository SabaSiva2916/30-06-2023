package org.sample;

public class Hello {

    public static void main(String[] args) {

	System.out.println("Hello World");
	String str = "java programm";
	// Doing Reverse of given String
	String[] split = str.split(" ");
	String output = "";
	for (String string : split) {
	    for (int i = string.length() - 1; i >= 0; i--) {
		output = output + string.charAt(i);
	    }
	    output = output + " ";
	}
	System.out.println("Reverse of given String :" + output);
    }

}
