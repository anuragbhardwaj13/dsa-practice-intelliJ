package LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

class Node{
    public int data;
    public Node next=null;
    public Node(int val){
        this.data=val;
    }
        }
public class MyLinkedList {
     private Node head;
     private Node tail;


    public MyLinkedList(){
        head=null;
        tail=null;
    }
    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            tail.next=null;
        }else{
         tail.next=node;
         tail=node;
         tail.next=null;
        }

    }

    public String toString(){
        Node temp=head;
        StringBuilder res=new StringBuilder();
        while (temp!=null){
            res.append(temp.data);
            if(temp.next!=null){
                res.append("->");
            }
            temp=temp.next;
        }
        return res.toString();
    }
    public int sumOfList(){
        int sum=0;
        Node curr=head;
        while(curr!=null){
            sum+=curr.data;
            curr=curr.next;
        }
        return sum;
    }
    public int indexOf(int val){
        int ind=0;
        Node curr=head;
        while (curr!=null){
            if(curr.data==val){
                return ind;
            }
            ind++;
            curr=curr.next;
        }
        return -1;
    }

    public void insertAt(int data,int pos){
        Node temp=head;
        int i=0;
        while (i<pos-1){
            i++;
//            System.out.println(temp.data+" temp");
            temp=temp.next;


        }
        Node node=new Node(data);
        node.next=temp.next;
        temp.next=node;
    }

    public void deleteAt(int pos){
        int i=0;
        Node temp=head;
        while (i<pos-1){
            i++;
            System.out.println(temp.data+" temp");
            temp=temp.next;
            System.out.println(temp.data+" temp.next");
        }
        temp.next=temp.next.next;

    }
    public void reverseIteratively(){
        Node curr=head;
        Node nextNode=head.next;
        Node prev=null;
        while(nextNode!=null){
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            nextNode=nextNode.next;

        }
        curr.next=prev;
        head=curr;
    }

    public void printRecursively(Node temp){
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        printRecursively(temp.next);
    }


    public void printRecursively(){
        printRecursively(head);
    }

    public Node reverseRecursively(Node head){
        if(head==null ||head.next==null){
            return head;
        }
        Node rest=reverseRecursively(head.next);
        Node next=head.next;
        next.next=head;
        head.next=null;
        return rest;

    }
    public void reverseRecursively(){
        head=reverseRecursively(head);
    }

    public boolean detectCycle(){
        HashMap<Node,Integer> hmap=new HashMap<>();
        Node temp=head;
        while (head!=null){
            if(hmap.containsKey(temp)){
                return true;
            }else{
                hmap.put(temp,1);
            }
        }
        return false;
    }

    public int detectFirstOfLoop(){
        HashMap<Node,Integer> ht=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            if (ht.containsKey(temp)) {

                return temp.data;
            }else{
                ht.put(temp,1);
            }
            temp=temp.next;
        }
        return -1;
    }
    boolean isPalindrome()
    {
        //Your code here
        if(head==null||head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("slow.data before reverse"+slow.data);
        slow.next=reverse(slow.next);
        slow=slow.next;
        System.out.println("slow.data after reverse"+slow.data);

        while(slow!=null){
            if(slow.data!=head.data){
                return false;
            }
            System.out.println("head.data in loop"+head.data);
            System.out.println("slow.data in loop"+slow.data);
            slow=slow.next;

            head=head.next;


        }
        return true;

    }
    static Node reverse(Node head){
        Node next=null;
        Node pre=null;
        while(head!=null){

            next=head.next;
            head.next=pre;
            pre=head;
            head=next;


        }

        return pre;

    }
    public void divide(){
        // code here
        Node oddStart=null;
        Node oddEnd=null;
        Node evenStart=null;
        Node evenEnd=null;
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                if(evenStart==null){
                    evenStart=temp;
                    evenEnd=evenStart;
                }else{
                    evenEnd.next=temp;
                    evenEnd=evenEnd.next;
                }
            }else{
                if(oddStart==null){
                    oddStart=temp;
                    oddEnd=oddStart;
                }else{
                    oddEnd.next=temp;
                    oddEnd=oddEnd.next;
                }
            }
            temp=temp.next;
        }

        if(oddStart==null || evenStart==null){
            return;
        }
        oddEnd.next=evenStart;
        evenEnd.next=null;
        head=oddStart;
    }
    public void segregate()
    {
        // add your code here
        Node temp=head;
        int nZero=0;
        int nOne=0;
        int nTwo=0;
        while(temp!=null){
            if(temp.data==0) nZero++;
            else if(temp.data==1) nOne++;
            else if(temp.data==2) nTwo++;
            temp=temp.next;
        }
        Node d=new Node(-1);
        Node curr=head;
        d.next=curr;


        for(int i=0;i<nZero;i++){
            curr.data=0;
            curr=curr.next;
        }
        for(int i=0;i<nOne;i++){
            curr.data=1;
            curr=curr.next;
        }
        for(int i=0;i<nTwo;i++){
            curr.data=2;
            curr=curr.next;
        }
        head=d.next;
    }


}