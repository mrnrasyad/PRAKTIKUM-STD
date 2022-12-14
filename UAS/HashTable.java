package com.UAS;

public class HashTable {
    private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;
	private long[] Password = new long[11];

    public HashTable(int size){
        size = 10;
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(-1);
	}

    public int hashFunction(int key){
		return key % arraySize;
	}
    
    public void insert(DataItem NoRek, long password){
		int key = NoRek.getKey();
		int hashValue = hashFunction(key);
		
		while(hashArray[hashValue] != null && hashArray [hashValue].getKey() != -1){
			++hashValue;
			hashValue %= arraySize;
		}
        hashArray[hashValue] = NoRek;
		insertPassword(NoRek, password);
	}

	public void insertPassword(DataItem NoRek, long password){
		int key = NoRek.getKey();
		int hashValue = hashFunction(key);
		
		while(hashArray[hashValue] != null && hashArray [hashValue].getKey() != -1){
			++hashValue;
			hashValue %= arraySize;
		}
		Password[hashValue] = password;
	}

    public DataItem find(int key, long password){
		int hashValue = hashFunction(key);
		
		while ( hashArray[hashValue] != null){
			if (hashArray[hashValue].getKey() == key)
				return hashArray[hashValue];
			++hashValue;
			hashValue %=arraySize;
		}
		return null;
	}

    public void displayTable(){
		System.out.append("Tabel: ");
        System.out.println(" ");
		for (int j=0; j<arraySize;j++){
			if (hashArray[j] != null)
				System.out.print("No. Rekening : " + hashArray[j].getKey()+ " ");
			else
				System.out.print("** ");
            System.out.println("Password : " + Password[j+1]);
		}
		System.out.println("");
	}
}
