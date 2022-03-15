package com.tugas;

import java.util.LinkedList;
import java.util.Queue;

public class belajarqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        //menambahkan elemen {1,2,3,4,5} ke queue
        for (int i = 1; i<6; i++)
        queue.add(i);
        //menampilkan isi dari queue
        System.out.println("Elemen queue\t: "+queue+", Ukuran: "+queue.size());
        //untuk menghapus data
        int delete = queue.remove();
        System.out.println("Elemen yang dihapus\t: "+delete);
        System.out.println("Isi queue setelah dihapus\t: "+queue+", Ukuran: "+queue.size());
        //untuk menampilkan elemen teratas dari queue
        int head = queue.peek();
        System.out.println("Elemen teratas\t: "+head);
        //untuk menampilkan elemen yang sudah dihapus
        System.out.println("Elemen yang teratas yang dihapus\t: "+queue.poll());
        System.out.println("Isi queue setelah dihapus\t: "+queue+", Ukuran: "+queue.size());
        //untuk menampilkan queue penuh atau tidak
        System.out.println("Cek queue penuh atau tidak\t: "+queue.isEmpty());
        //untuk menambahkan data
        queue.add(24);
        queue.add(8);
        System.out.println("Isi queue setelah ditambah\t: "+queue+", Ukuran: "+queue.size());
        //untuk menghapus semua data
        queue.clear();
        System.out.println("Isi queue setelah dihapus\t: "+queue+", Ukuran: "+queue.size());
        System.out.println("Cek queue penuh atau tidak\t: "+queue.isEmpty());
    }
}