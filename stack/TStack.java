package stack;

import java.util.Arrays;

public class TStack {
    int[] array;
    int size;
    TStack(){
        array=new int[2];
        size=0;
    }
    public void push(int value){
        if(size==array.length){
            array= Arrays.copyOf(array,2*size);
        }
        array[size++]=value;
    }
    public void pop(){
        if(size>0){
            size--;
        }
    }
    public int peek(){
        return array[size-1];
    }
    public int size(){
        return size;
    }
    public boolean Empty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        TStack p=new TStack();
        p.push(1);
        p.push(2);
        p.push(3);
        System.out.println(p.peek());
        System.out.println(p.size());
        System.out.println(p.Empty());
    }
}
