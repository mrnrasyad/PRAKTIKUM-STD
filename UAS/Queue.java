package com.UAS;

public class Queue {
    node head;
    node tail;
    int size;

    class node {
        static String data;
        node next;
      
        public node(String data) {
          this.data = data;
        }
      }

    public Queue() {
    head = null;
    tail = null;
    size = 0;
    }

    public boolean isEmpty() {
        return head == null;
      }
    
      public int size() {
        return size;
      }
    
      public void enqueue(String data) {
        node Node = new node(data);
        if (tail != null) {
          tail.next = Node;
        }
        tail = Node;
    
        if (head == null) {
          head = Node;
        }
        size++;
      }
    
      public String dequeue() {
        node Node = head;
        head = head.next;
    
        if (head == null) {
          tail = null;
        }
        size--;
        return node.data;
      }
    
      public void print() {
        node temp = head;
        while (temp != null) {
          System.out.println(temp.data);
          temp = temp.next;
        }
      }
}
