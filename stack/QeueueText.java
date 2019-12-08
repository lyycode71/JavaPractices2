package stack;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Stack;

public class QeueueText {
   static Stack<Integer> stack1;
   static Stack<Integer> stack2;

    QeueueText() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public static void pushed(int element) {
        stack1.push(element);
    }
    public static int pop(){
        if(stack2.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    public static int peek(){
        int a=pop();

        stack2.push(a);
        return a;
    }
    public static boolean empty(){
            return stack1.isEmpty()&&stack2.isEmpty();

    }

    public static void main(String[] args) {
        QeueueText p=new QeueueText();
        p.pushed(1);
        p.pushed(2);
        p.pushed(3);
        System.out.println(p.peek());
        System.out.println(p.pop());
        System.out.println(p.empty());
    }
}