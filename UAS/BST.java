package com.UAS;
import java.util.*;

public class BST {
    public Node2 root;
	public BST(){
		root = null;
	}

    public void insert(int id, String nm){
		Node2 nodeBaru = new Node2();
		nodeBaru.umur = id;
        nodeBaru.nama = nm;
		
		if (root == null)
			root = nodeBaru;
		else{
			Node2 baru = root;
			Node2 parent;
			while (true){
				parent = baru;
				if (id < baru.umur){ 
					baru = baru.leftChild;
					if (baru==null){
						parent.leftChild = nodeBaru;
						return;
					}
				}
				else{
					baru = baru.rightChild;
					if (baru == null){
						parent.rightChild = nodeBaru;
						return;
					}
				}
			}
		} 
	}
    
    
    public void displayTree(){
		Stack globalStack = new Stack();
		globalStack.push(root);
		int n = 32;
		boolean cekBarisKosong = false;
		System.out.println(".................................."
+".............................................."
+"..............................................");
		while (cekBarisKosong == false){
			Stack localStack = new Stack();
			cekBarisKosong = true;
			
			for (int j=0; j<=n;j++)
				System.out.print(" ");
			
			while (globalStack.isEmpty() == false){
				Node2 temp = (Node2)globalStack.pop();
				if (temp != null){
					System.out.print(temp.umur);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					
					if (temp.leftChild != null || temp.rightChild != null)
						cekBarisKosong = false;
				}
				else {
					System.out.print("..");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j=0; j<=n*2-2; j++)
					System.out.print(" ");
			}//end while globalStack tidak kosong
			System.out.println();
			n /= 2 ;
			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		}// end while cekBarisKosong bernilai salah
		System.out.println(".................................."
+".............................................."
+"..............................................");
		
	}
	public int MemberTerlama(){
        Node2 max = root;
		while (max.rightChild != null){
				max = max.rightChild;
		}
		return max.umur;
    }

    public int MemberTerbaru(){
        Node2 max = root;
		while (max.leftChild != null){
				max = max.leftChild;
		}
		return max.umur;
    }
}
