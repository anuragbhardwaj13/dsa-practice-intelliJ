package Stack;

import java.util.EmptyStackException;

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class MyStackList {
    private Node head;
    private int size;

    public MyStackList(){
        Node head=null;
        size=0;
    }

    public void push(int item){
        Node node=new Node(item);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
        this.size++;

    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            Node temp=head;
            int val=temp.data;
            head=temp.next;
            temp.next=null;
            return val;
        }
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            return head.data;
        }
    }

    public int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        Node temp=head;
        while(temp!=null){
            sb.append(temp.data).append('\n');
            temp=temp.next;
        }
        return sb.toString();
    }

}
