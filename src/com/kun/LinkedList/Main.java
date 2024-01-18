package com.kun.LinkedList;

public class Main {


    public static void main(String[] args) {
        LL l=new LL();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertFirst(40);
        l.insertFirst(50);
        l.display();
        l.insertLast(60);
        l.insertIndex(1100,3);
        l.display();
        l.displayHeadTail();
        l.deleteFirst();
        l.displayHeadTail();
        l.display();
        l.deleteLast();
        l.display();
        l.displayHeadTail();


    }
}
