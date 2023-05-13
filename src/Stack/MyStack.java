package Stack;

import java.util.EmptyStackException;

public class MyStack {
    private int[] items;
    private int top;
    private int size;

    public MyStack(int size){
        this.size=size;
        this.items=new int[size];
        this.top=0;
    }

    public void push(int element){
        if(top==size){
            throw new StackOverflowError();
        }
        this.items[this.top]=element;
        this.top++;
    }
    public String toString(){
        StringBuilder s=new StringBuilder();
        for(int i=size-1;i>=0;i--){
            if(i==0){
                s.append(items[i]);
            }else{
                s.append(items[i]).append("\n");

            }
        }
        return s.toString();
    }

    public int size(){
        return this.top;
    }
    public int pop(){
        if(top==0){
            throw new EmptyStackException();

    }
        this.top--;

        int value= items[top];
        items[top]=0;
        return value;
    }
    public boolean isEmpty(){
        if(top==0){
           return true;
        }
        return false;
    }

    public int peek(){
        return items[top-1];
    }
}
