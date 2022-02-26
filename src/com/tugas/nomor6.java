package com.tugas;

import java.util.ArrayList;

public class nomor6 {
    public static void main(String[] args) {
        //String[] nama = {"E","L","I","A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("E");
        nama.add("L");
        nama.add("I");
        nama.add("A");
        //add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)

        
        nama.add(0,"E");
        System.out.println("ArrayList setelah menambahkan huruf e "+nama);

        nama.add(2,"F");
        System.out.println("ArrayList setelah menambahkan huruf f "+nama);

        nama.add(3,"G");
        System.out.println("ArrayList setelah menambahkan huruf g "+nama);

        nama.add(4,"H");
        System.out.println("ArrayList setelah menambahkan huruf h "+nama);

        nama.add(6,"H");
        System.out.println("ArrayList setelah menambahkan huruf h "+nama);

        nama.add(-3,"J");
        System.out.println("ArrayList setelah menambahkan huruf j "+nama);

    }
    
}