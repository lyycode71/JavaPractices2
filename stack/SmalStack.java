package stack;

import java.util.Stack;

public class SmalStack {
    Stack<Integer> stack;
    Stack<Integer> sStack;
    SmalStack(){
        stack=new Stack<>();
        sStack=new Stack<>();
    }
    public void push(int element){
        stack.push(element);
        if(sStack.isEmpty()||element<=sStack.peek()){
            sStack.push(element);
        }
        if(element<=sStack.peek()){
            sStack.push(element);
        }
    }
    public int pop(){
        int ret=stack.peek();//自动拆箱 也可以使用equals比较内容
        if(ret==sStack.peek()){
            sStack.pop();
        }
        return stack.pop();
    }
    public int getMin(){
        return sStack.peek();
    }

    public static void main(String[] args) {
        SmalStack p=new SmalStack();
        p.push(1);
        p.push(3);
        p.push(2);
        System.out.println(p.getMin());
        System.out.println(p.getMin());
        System.out.println(p.pop());
    }
}
