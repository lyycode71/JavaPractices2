
/*public ListNode removeElements(ListNode,int val){
ListNode last=null;
}*/
public ListNode reverseList(ListNode head){
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
public ListNode reverseList(ListNode head){
	Node nHead=null;
	Node cur=head;
	while(cur!=null){
		Node next=cur.next;
		cur.next=nHead;
		nHead=cur;
		cur=next;
	}
	return nHead;
}