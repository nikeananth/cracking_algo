package com.kun.LinkedList;

public class LL {


    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size=0;
    }

    class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.next = next;
        }
    }


    public void insertFirst(int val){

        Node node=new Node(val);
        node.next=this.head;
        this.head=node;

        if(tail==null){
            this.tail=this.head;
        }
        this.size+=1;
    }


    public void insertLast(int val){

        if(this.tail==null){
            insertFirst(val);
        }else{
            Node node=new Node(val);
            this.tail.next=node;
            tail=node;
            this.size+=1;
        }
    }


    public int delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node pre=getNode(index-1);
        pre.next=pre.next.next;
        return pre.value;
    }


    public void deleteFirst(){

      if(head!=null){
          head=head.next;
      }
      if(head==null){
          tail=null;
      }
      size--;

    }


    Node getNode(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }


    Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            else{
                node=node.next;
            }
        }
        return null;
    }

    public void deleteLast(){

       if(size<=1){
           deleteFirst();
       }
       Node secondLast=getNode(size-2);
       int val= secondLast.value;
        System.out.println(val);
        secondLast.next=null;
        tail=secondLast;
    }

    public void insertIndex(int val,int index){
        int count=0;
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp= head;
      for(int i=1;i<index;i++){
          temp=temp.next;
      }
      Node node=new Node(val);
      node.next=temp.next;
      temp.next=node;
      size++;
    }



    public void display(){
        Node temp=this.head;

        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void displayHeadTail(){
        System.out.print("head-->"+head.value);
        System.out.println("tail-->"+tail.value);
    }











}
