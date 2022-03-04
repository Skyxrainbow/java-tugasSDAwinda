package com.tugas;

import java.util.LinkedList;
import java.util.ListIterator;

public class tugas3 {
    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<>();
        data.add("2111521002");
        data.add("Winda Adelia");
        data.add("Pekanbaru");
        System.out.println("List : "+data);

        //add
        data.addFirst("2111521004");
        data.add(1,"Lutfia Aulia");
        data.add(2, "Padang");
        data.add(6, "2111521010");
        data.add(7, "Salsabila Rahmah");
        data.addLast("Padang");
        System.out.println("List setelah menambahkan item : "+data);

        //get
        System.out.println("Elemen indeks 4 adalah : "+data.get(4));
        System.out.println("Elemen indeks 0 adalah : "+data.getFirst());
        System.out.println("Elemen indeks terakhir adalah : "+data.getLast());

        //indexOf
        System.out.println("Item Padang pertama terdapat di indeks : "+data.indexOf("Padang"));
        System.out.println("Item Padang terakhir terdapat di indeks : "+data.lastIndexOf("Padang"));

        //offer
        data.offer("2111521006");
        data.offer("Mutiara Maharani");
        data.offerLast("Pariaman");
        data.offerFirst("2111511006");
        System.out.println("LinkedList setelah menambahkan dengan offer : "+data);

        //set
        data.set(3, "Agam");
        data.set(9, "Batusangkar");
        System.out.println("Isi list terbaru : "+data);

        //size
        System.out.println("Ukuran list yaitu : "+data.size());

        //remove
        data.remove();
        data.remove(10);
        data.remove("Pariaman");
        data.remove(9);
        System.out.println("Linked List setelah diremove : "+data);

        //peek
        System.out.println("Kepala LinkedList : "+data.peek());
        System.out.println("Elemen pertama LinkedList : "+data.peekFirst());
        System.out.println("Elemen terakhir LinkedList : "+data.peekLast());

        //pop
        data.pop();
        data.pop();
        data.pop();
        System.out.println("List setelah menggunakan pop : "+data);

        //push
        data.push("Kampar");
        data.push("Dinda Mestika");
        data.push("2111511006");
        System.out.println("List setelah menggunakan push : "+data);

        //listIterator
        ListIterator<String> list_Iter = data.listIterator(7);
        System.out.println("List dimulai dari indeks 7 ");
        while(list_Iter.hasNext()){
            System.out.println(list_Iter.next());
        }

        //clear
        data.clear();
        System.out.println("List setelah data di clear : "+data);
    }
}