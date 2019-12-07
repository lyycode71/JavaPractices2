public class CompareTo {
    public static int compare(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        int s=0;
        if(l1>=l2){
            s=l2;
        }else{
            s=l1;
        }
        for(int i=0;i<s;i++){
            if(s1.charAt(i)-s2.charAt(i)>0){
                return 1;
            }else if(s1.charAt(i)-s2.charAt(i)<0){
                return -1;
            }else{
                continue;
            }
        }
        if(l1==l2){
            return 0;
        }
        else
            return (s==l1)?-1:1;
    }
    public static boolean contain(String l1,String l2){
        if(l1.length()==0&&l2.length()==0){
            return true;
        }
        char[] a1=l1.toCharArray();
        char[] a2=l2.toCharArray();
        boolean result=false;
        int f=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i]==a2[f]){
                if(f==a2.length-1){
                    result=true;
                    break;
                }
                f++;
            }else{
                if(a1.length-i<a2.length){
                    break;
                }
                f=0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int t=compare("abc","bcd");
        System.out.println(t);
        boolean c=contain("abc","n");
        System.out.println(c);
    }
}
