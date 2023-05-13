package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray {
    private int[] items;

    private int currIndex;


    public MyArray(int initialSize){
    this.items=new int[initialSize];
    this.currIndex=0;
    }

    public void insert(int val){
        this.items[currIndex]=val;
        currIndex++;
    }

    public String toString(){
        StringBuilder str=new StringBuilder();
        str.append('[');
        for (int num:this.items){
            str.append(num+", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }
    public int indexOf(int val){
        for(int i=0;i<currIndex;i++){
            if(this.items[i]==val){
                return i;
            }
        }
        return -1;
    }




}
