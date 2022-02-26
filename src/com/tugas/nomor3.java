package com.tugas;

import java.util.ArrayList;

public class nomor3 {
    public static void main(String[] args) {
        //String[] nama = {"E","L","I","A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("E");
        nama.add("L");
        nama.add("I");
        nama.add("A");
        //get(0), get(2), get(6), get(-3)

        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));
    }
    
}
