import java.util.Stack;

public class StackDemo {
    public static boolean stack(String s){
        Stack<Character> list=new Stack<>();
        char a[][]={{'<','>'},{'(',')'},{'{','}'}};
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int f = 0;
            for (int j = 0; j < 3; j++) {
                if (ch == a[j][0]) {
                    list.push(ch);
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                if(list.isEmpty())
                    return false;
                char topch=list.pop();
                for(int k=0;k<s.length();++k){
                    if (topch == a[k][0]) {
                        if(ch==a[k][1])
                        list.pop();
                    }
                }

            }
        }
    }
    public static void main(String[] args) {

    }
}
