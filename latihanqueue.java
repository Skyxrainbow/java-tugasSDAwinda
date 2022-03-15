package com.tugas;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class latihanqueue {
    public static void main(String[] args) {
        int menu,no;
        String nama,pesanan;
        Scanner input=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        //deklarasi queue
        Queue<Integer> nomor= new LinkedList<>();
        Queue<String> name= new LinkedList<>();
        Queue<String> pesan= new LinkedList<>();

        System.out.println("\n\t\t=======================================================================================");
        System.out.println("\t\t\t\t\t  Selamat datang di Bakery");
        System.out.println("\t\t=======================================================================================");
        
        do{
            System.out.println("\n\n");
            System.out.println("\t\t\t\t==============================");
            System.out.println("\t\t\t\t\t  PILIH MENU  ");
            System.out.println("\t\t\t\t==============================");
            System.out.println("\t\t\t\t1. Masuk ke antrian");
            System.out.println("\t\t\t\t2. Antrian Dipanggil");
            System.out.println("\t\t\t\t3. Lihat data antrian");
            System.out.println("\t\t\t\t4. Keluar");
            System.out.println("\t\t\t\t==============================");
            System.out.print("\t\t\t\t     Pilihan Anda : ");
            menu=input.nextInt();
            System.out.println("\n");
            if(menu==1){
                System.out.println("\t\t\t\t==============================");
                System.out.print("\t\t\t\tMasukan no antrian: ");
                no = input.nextInt();
                nomor.add(no);
                System.out.print("\t\t\t\tMasukan nama      : ");
                nama = in.nextLine();
                name.add(nama);
                System.out.print("\t\t\t\tMasukan pesanan   : ");
                pesanan = in.nextLine();
                pesan.add(pesanan);

            }else if(menu==2){
                if(nomor.isEmpty()){
                    System.out.println("\t\t\t\tCEK KEMBALI PELANGGAN ANDA!!");
                }else{
                System.out.println("\t\t\t\tNOTICE!!");
                System.out.println("\t\t\t\tPemanggilan atas nama : "+name.poll());
                nomor.remove();
                pesan.remove();
                }
            }else if(menu==3){
                if(nomor.isEmpty()){
                    System.out.println("\t\t\t\tTIDAK ADA PELANGGAN!!");
                }else{
                    
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t         DATA PELANGGAN");
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t|| NOMOR      : "+nomor);
                    System.out.println("\t\t\t\t|| NAMA       : "+name);
                    System.out.println("\t\t\t\t|| PESANAN    : "+pesan);
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t|| PELANGGAN PERTAMA: "+name.peek());
                    System.out.println("\t\t\t\t|| TOTAL PELANGGAN  : "+name.size());
                }
            }else if(menu==4){
                System.out.println("\n\t\t\t\t**** Terima Kasih ****");
            }else{
                System.out.println("\n\t\t\t\tTidak tersedia!!");
            }
        }while(menu!=4);
    }
}
