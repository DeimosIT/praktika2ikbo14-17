package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Author a1 = new Author("paul", "@paulpower", 'M');
        System.out.println(a1);
        a1.setEmail("@paulomegapower");
        System.out.println(a1);
    }
}
