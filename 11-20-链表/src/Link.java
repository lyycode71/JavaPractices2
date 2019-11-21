public class Link {
    public static Node build(){
        Node n1=new Node(2);
        Node n2=new Node(3);
        n1.next=n2;
        return n1;
    }
    public static Node reverseList(Node head){
        Node p1=null;
        Node p2=head;
        while(p2!=null){
            Node p3=p2.next;
            p2.next=p1;
            p1=p2;
            p2=p3;
        }
        return p1;
    }
    public static Node mergeLists(Node list1,Node list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        Node cur1=list1;
        Node cur2=list2;
        Node nHead=null;
        Node nLast=null;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<=cur2.val){
                if(nHead==null){   //如果新链表为空，只有第一次插入才是空的
                    nHead=cur1;
                }else{
                    nLast.next=cur1;
                }
                nLast=cur1;
                cur1=cur1.next;
            }

            if(cur1.val>cur2.val){
                if(nHead==null){
                    nHead=cur2;
                }else{
                    nLast.next=cur2;
                }
                nLast=cur2;
                cur2=cur2.next;
            }
        }
        if(list1!=null){
            nLast.next=cur1;
        }
        if(list2!=null){
            nLast.next=cur2;
        }
        return nHead;
    }
    public static Node partation(Node head,int x){
        Node cur=head;
        Node sHead=null;
        Node sLast=null;
        Node bHead=null;
        Node bLast=null;
        while(cur!=null){
            if(cur.val<x){
                if(sHead==null){
                    sHead=cur;
                }else{
                    sLast.next=cur;
                }
                sLast=cur;
            }else{
                if(bHead==null){
                    bHead=cur;
                }else{
                    bLast.next=cur;
                }
                bLast=cur;
            }

            cur=cur.next;
        }
        if(sHead==null){
            return bHead;
        }
        if(bHead==null){
            return sHead;
        }
        sLast.next=bHead;
        bLast.next=null;
        return sHead;
    }
    public static Node middleNode(Node head){
        Node cur=head;
        int size=0;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        int mid=size/2;
        for(int i=0;i<=mid;i++){
            head=head.next;
        }
        return head;
    }
    public static Node middle(Node head){
        Node fast=head;
        Node low=head;
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
    public static Node reverseL(Node head){
        Node p1=middle(head);
        Node p2=null;
        while(p1!=null){
            Node p3=p1.next;
            p1.next=p2;
            p1=p3;
            p2=p1;

        }
        return p2;
    }
    public static boolean chk(Node head){
        Node k=reverseL(head);
        Node a=head;
        while(a!=null&&k!=null){
            if(a.val!=k.val) {
                return false;
            }
                a = a.next;
                k = k.next;

        }
        return true;
    }
    public static Node part(Node head,int x){
        Node cur=head;
        Node sHead=null;
        Node sLast=null;
        Node bHead=null;
        Node bLast=null;
        while(cur!=null){
            if(cur.val<=x){
                if(sHead==null){
                    sHead=cur;
                }else{
                    sLast.next=cur;
                }
                sLast=cur;
            }
            if(cur.val>x){
                if(bHead==null){
                    bHead=cur;
                }else{
                    bLast.next=cur;
                }
                bLast=cur;
            }

            cur=cur.next;
        }
        if(sHead==null){
            return bHead;
        }
        if(bHead==null){
            return sHead;
        }
        sLast.next=bHead;
        bLast.next=null;
        return sHead;
    }
    public static Node deleteDuplication(Node head){
        if(head==null){
            return head;
        }
        Node pre=new Node(0);
        Node fake=pre;
        pre.next=head;
        Node cur=head;
        Node next=head.next;
        while(next!=null){
            if(cur.val!=next.val){
                pre=pre.next;
                cur=cur.next;
                next=next.next;
            }else{
                while(next!=null&&cur.val==next.val){
                  next=next.next;
                }
                pre.next=next;
                cur=next;
                if(next!=null){
                    next=next.next;
                }
            }
        }
        return fake.next;
    }
    public static void main(String[] args){
     Node head=build();
     Node nHead=reverseList(head);
     Node p1=mergeLists(head,nHead);

    }
}
