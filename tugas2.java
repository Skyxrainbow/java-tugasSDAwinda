package com.tugas;

import java.util.LinkedList;

public class tugas2 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<>();
        saya.add("W");
        saya.add("I");
        saya.add("N");
        saya.add("D");
        saya.add("A");
        saya.add(" ");
        saya.add("A");
        saya.add("D");
        saya.add("E");
        saya.add("L");
        saya.add("I");
        saya.add("A");
        System.out.println("Isi Linked List\t: "+saya+", Ukuran: " +saya.size());

        //add karakter lain yang anda inginkan
        saya.addFirst("X");
        saya.addLast("Z");
        System.out.println("output tambah\t: "+saya+", Ukuran: " +saya.size());

        //sisipkan karakter lain yang anda inginkan
        saya.set(7,"S");
        saya.set(8,"K");
        saya.set(9,"Y");
        System.out.println("output sisip\t: "+saya+", Ukuran: " +saya.size());

        //hapus beberapa karakter yang ingin anda hapus
        saya.removeFirst();
        saya.removeLast();
        System.out.println("output hapus\t: "+saya+", Ukuran: " +saya.size());

        //buat fungsi POP dan PUSH pada project anda
        saya.pop();
        saya.pop();
        System.out.println("output pop\t: "+saya+", Ukuran: " +saya.size());

        saya.push("I");
        saya.push("W");
        System.out.println("output push\t: "+saya+", Ukuran: " +saya.size());
    }
}