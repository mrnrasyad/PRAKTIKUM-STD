package com.UAS;
import java.util.Scanner;

public class BankApp {
    public static HashTable hash = new HashTable(10);
    public static DoubleList DLL = new DoubleList();
    public static Scanner sc = new Scanner(System.in);
    public static BST tree = new BST();
    public static Node2 node = new Node2();
    public static DataItem NoRek;

    public static void Database(){
        NoRek = new DataItem(1234);
        hash.insert(NoRek, 1);
        DLL.tambahData(1234, "Ucup", 15000);
        tree.insert(5, "Ucup");

        NoRek = new DataItem(1235);
        hash.insert(NoRek, 2);
        DLL.tambahData(1235, "Charles", 19000);
        tree.insert(7, "Charles");

        NoRek = new DataItem(1236);
        hash.insert(NoRek, 3);
        DLL.tambahData(1236, "Udin", 1000);
        tree.insert(10, "Udin");

        NoRek = new DataItem(1237);
        hash.insert(NoRek, 4);
        DLL.tambahData(1237, "Dilan", 20000);
        tree.insert(8, "Dilan");
    }

    public static void ProgramNasabah(){
        System.out.print("Masukkan No. Rekening anda: ");
        int key = sc.nextInt();

        System.out.print("Masukkan pin: ");
        int key2 = sc.nextInt();

        DataItem data = hash.find(key, key2);

        if (data != null) {
            System.out.println(key+ " terdaftar");
            boolean stop = true;
            while (stop) {
                System.out.println("Menu pilihan:\n1. Cek Saldo \n2. Tarik tunai \n3. Simpan saldo \n4. Transfer \n5. Keluar");
                System.out.print("Pilih: ");
                int pilih = sc.nextInt();
                switch(pilih){
                    case 1:
                        System.out.println(" ");
                        DLL.cekSaldo(key);
                        break;
                    case 2:
                        System.out.println("Tarik Tunai");
                        System.out.println("Masukkan nominal uang: ");
                        long tarik = sc.nextLong();
                        System.out.printf("Sisa saldo anda %d \n", DLL.TarikTunai(key, tarik));
                        break;
                    case 3:
                        System.out.println("Simpan Uang");
                        System.out.println("Masukkan nominal uang: ");
                        long simpan = sc.nextLong();
                        System.out.printf("Sisa saldo anda %d \n", DLL.SimpanSaldo(key, simpan));
                        break;
                    case 4:
                        System.out.println("Transfer Uang");
                        System.out.println("Masukkan no. rekening tujuan : ");
                        long NoRekTujuan = sc.nextLong();
                        System.out.println("Masukkan nominal trasnfer : ");
                        long transfer = sc.nextLong();
                        System.out.printf("Transaksi berhasil sebesar %d\n", transfer, " ke no. rekening %d \n", NoRekTujuan);
                        System.out.printf("Sisa saldo anda %d \n", DLL.Transfer(key, transfer));
                        break;
                    case 5:
                        stop = false;
                        break;
                        default:
                        System.out.println("Pilihan menu tidak tersedia.");
                }
            }

        } else {
            System.out.println(key+ " tidak ditemukan. ");
        }
    }

    public static void ProgramAdmin(){
        boolean stop = true; {
            while(stop) {
            System.out.println("Program Admin");
            System.out.println("Menu pilihan:\n1. Tampilkan Data Nasabah  \n2. Tampilkan Umur Akun Nasabah \n3. Tampilkan Umur Akun Member Terlama \n4. Tampilkan Umur Akun Member Terbaru \n5. Keluar");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    DLL.displayData();
                break;
                case 2:
                    tree.displayTree();
                break;
                case 3:
                    System.out.println("Member terlama " + tree.MemberTerlama() + " tahun");
                break;
                case 4:
                    System.out.println("Member terlama " + tree.MemberTerbaru() + " tahun");
                break;
                case 5:
                    stop = false;
                    break;
                    default:
                    System.out.println("Pilihan menu tidak tersedia.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Database();
        int password = 1234;

        System.out.println(" ---- BANK JUARA ----");
        System.out.println("Pilih Program:\n1. Program Admin \n2. Program Nasabah");
        int pilih = sc.nextInt();
        if (pilih == 1 ) {
            System.out.println("Program Admin");
            System.out.println("Masukkan password: ");
            int pass = sc.nextInt();
            if (pass == password) {
                ProgramAdmin();
            } else {
                System.out.println("Password Salah");
                main(args);
            }
        } else {
            ProgramNasabah();
        }

    }
}