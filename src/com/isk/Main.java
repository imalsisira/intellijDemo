package com.isk;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("sample project");
        System.out.println("push");
        Main mm = new Main();
        String value = mm.returnValue();
        System.out.println(value);
    }

    public String returnValue() {
        String myvalue = "this is text";
        return myvalue;
    }
}
