package com.UAS;

public class DoubleList {
    DataItem NoRek;
    private Node head, tail;

    public void tambahData(int NoRek, String nama, long saldo){
		Node nodeBaru = new Node(NoRek, nama, saldo); 
		if (head == null) 			
			tail = nodeBaru;		
		else
		head.prev = nodeBaru; 	   
		nodeBaru.next = head;		
		head = nodeBaru;			
	}

	public long TarikTunai(int key, long tarik){
		Node bantu = head;
		while (bantu.data != key){
			bantu = bantu.next;
			if (bantu == null)
				System.out.println("Data tidak ditemukan");
		}
		if (bantu.data3 < 10000) {
			System.out.println("Saldo tidak mencukupi.");
		} else {
			bantu.data3 = bantu.data3 - tarik;
		}
		return bantu.data3;
	}

	public long SimpanSaldo(int key, long simpan){
		Node bantu = head;
		while (bantu.data != key){
			bantu = bantu.next;
			if (bantu == null)
				System.out.println("Data tidak ditemukan");
		}
		bantu.data3 = bantu.data3 + simpan;
		return bantu.data3;
	}

	public long Transfer(int key, long transfer){
		Node bantu = head;
		while (bantu.data != key){
			bantu = bantu.next;
			if (bantu == null)
				System.out.println("Data tidak ditemukan");
		}
		if (bantu.data3 < 10000) {
			System.out.println("Saldo tidak mencukupi.");
		} else {
			bantu.data3 = bantu.data3 - transfer;
		}
		return bantu.data3;
	}

    public void cekSaldo(int key) {
		Node bantu = head;
		while (bantu.data != key){
			bantu = bantu.next;
			if (bantu == null)
				System.out.println("Data tidak ditemukan");
		}
        bantu.displayNode();
	}

	public void displayData(){
		System.out.println("Data Nasabah");
		Node bantu = head;
		while (bantu != null){
			bantu.displayNode();
			bantu = bantu.next;
		}
		System.out.println(" " );
	}
}

