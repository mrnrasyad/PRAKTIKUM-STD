package com.UAS;

public class Node {
    public int data;
    public String data2;
    public long data3;
    public Node next;
    public Node prev;

    public Node(int NoRek, String nama, long saldo) {
        data = NoRek;
        data2  = nama;
        data3 = saldo;
    }

    public void displayNode(){
        System.out.println("Nama Nasabah : " + data2);
        System.out.println("Saldo : " + data3);
        System.out.println("-------------------------");
    }
}
