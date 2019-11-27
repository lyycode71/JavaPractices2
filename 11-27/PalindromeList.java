public class PalindromeList {
    public ListNode mid(ListNode A){
        ListNode fast=A;
        ListNode low=A;
        while(fast!=null){
            fast=fast.next;
            if(fast==null){
                break;
            }
            fast=fast.next;
            low=low.next;
        }
        return low;
    }
    public ListNode reverse(ListNode A){
        ListNode p1=A;
        ListNode p2=null;
        while(p1!=null){
            ListNode p3=p1.next;
            p1.next=p2;
            p2=p1;
            p1=p3;
        }
        return p2;
    }
    public boolean chkPalindrome(ListNode A) {
        ListNode B=mid(A);
        ListNode C=reverse(B);
        ListNode cur=A;
        while(cur!=null&&C!=null){
            if(cur.val!=C.val){
                return false;
            }
                cur=cur.next;
                C=C.next;
        }
        return true;
    }
}