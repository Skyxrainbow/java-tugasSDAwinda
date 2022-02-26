package com.tugas;

import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {
        //String[] nama = {"E","L","I","A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("E");
        nama.add("L");
        nama.add("I");
        nama.add("A");

        System.out.println("ArrayList sebelum remove: ");
        for(String var: nama){
            System.out.println(var);
        }
        //remove(0), remove(3), remove(2)

        nama.remove(0);
        //nama.remove(3);
        //nama.remove(2);

        System.out.println("ArrayList sesudah remove: ");
        for(String var2: nama){
            System.out.println(var2);
        }
    }   
}
