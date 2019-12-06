import java.util.ArrayList;
import java.util.List;

public class balance {
    public static int balanced(String s) {
        List<Character> list1 = new ArrayList<>();
        int i = 0;
        //   int j = 0;
        for (char c : s.toCharArray()) {
            if (list1 == null) {
                return 1;
            }
            if (list1.isEmpty()) {
                list1.add(c);
            } else if (c == list1.get(list1.size() - 1)) {
                list1.add(c);
            } else {
                list1.remove(list1.size() - 1);
                if (list1.isEmpty()) {
                    i++;
                }
            }
        }
            return i;
    }



    public static void main(String[] args) {
        String s="LLRR";
        int j=balanced(s);
        System.out.println(j);
    }
}


