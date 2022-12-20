package com.UAS;

public class Node2 {
    public int umur;
    public String nama;
    public Node2 leftChild;
    public Node2 rightChild;
    
    public void displayNode3(){ 
        System.out.print("{");
        System.out.print(nama);
        System.out.print(umur);
        System.out.print("}");
    }
}
