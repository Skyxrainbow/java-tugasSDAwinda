package com.tugas;

import java.util.ArrayList;

public class nomor4 {
    public static void main(String[] args) {
        //String[] nama = {"E","L","I","A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("E");
        nama.add("L");
        nama.add("I");
        nama.add("A");
        //indexOf(a), indexOf(c), indexOf(q)

        System.out.println("Huruf A adalah index ke "+nama.indexOf("A"));
        System.out.println("Huruf C adalah index ke "+nama.indexOf("C"));
        System.out.println("Huruf Q adalah index ke "+nama.indexOf("Q"));
    }
    
}
