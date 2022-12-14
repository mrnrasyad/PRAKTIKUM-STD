package com.UAS;
import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {
        HashTable hash = new HashTable(10);
        Scanner sc = new Scanner(System.in);

        //Data No. Rekening dan Password.
        DataItem NoRek;

        NoRek = new DataItem(1234);
        hash.insert(NoRek, 1);

        NoRek = new DataItem(1235);
        hash.insert(NoRek, 2);

        NoRek = new DataItem(1236);
        hash.insert(NoRek, 3);

        NoRek = new DataItem(1237);
        hash.insert(NoRek, 4);


        //--------------------------------------------------
        System.out.println(" ---- BANK JUARA ----");
        System.out.print("Masukkan No. Rekening anda: ");
        int key = sc.nextInt();

        System.out.print("Masukkan pin: ");
        int key2 = sc.nextInt();

        DataItem data = hash.find(key, key2);

        if (data != null) {
            System.out.println(key+ " terdaftar");
            boolean stop = true;
            while (stop) {
                System.out.println("Menu pilihan:\n1. Cek Saldo \n2. Tabung Uang \n3. Transfer Uang \n4. Keluar");
                System.out.print("Pilih: ");
                int pilih = sc.nextInt();
                switch(pilih){
                    
                }
            }

        } else {
            System.out.println(key+ " tidak ditemukan. ");

        }
    }
}