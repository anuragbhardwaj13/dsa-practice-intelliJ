package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.insert(0);
        list.insert(1);
        list.insert(0);
        list.insert(2);
        list.insert(1);
        list.insert(2);
        list.segregate();
        System.out.println(list);
    }
}
