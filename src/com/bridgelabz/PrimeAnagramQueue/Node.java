package com.bridgelabz.PrimeAnagramQueue;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
        Queue.size++;
    }
}