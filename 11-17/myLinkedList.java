public class myLinkedList{
	public static Node buildLinkedListHand(){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		return n1;
	}
	public static void printLinkedList(Node head){
		Node cur=head;
		while(cur!=null){
			System.out.println(cur.val);
			cur=cur.next;
		}
	}
	public static void PrintPartList(Node head){
		/*Node cur;
		for(int i=0;i<2;i++){
			cur=cur.next;
		}
		for(int n=cur;n!=null;n=n.next){
			System.out.println(n.val);
		}*/
	}
	public static Node popBack(Node head){
		if(head==null){
			throw new RuntimeException("空链表");
		}
		if(head.next==null){
			return null;
		}else{
			Node cur=head;
			while(cur.next.next!=null){
				cur=cur.next;
			}
			cur.next=null;
			return head;
		}
	}
	public static Node pushBack(Node head,int val){
		Node node=new Node(val);
		if(head==null){
			return node;
		}else{
		Node cur=head;
		while(cur.next!=null){
			cur=cur.next;
		}
		cur.next=node;
		return head;
		}
	}
	public static Node pushFront(Node head,int val){
		Node node=new Node(val);
		node.next=head;
		return node;
	}
	public static Node popFront(Node head){
		if(head==null){
			throw new RuntimeException("空链表");
		}
		return head.next;
	}
	public static void main(String[] args){
		Node head=null;
		head=pushFront(head,0);
		head=pushFront(head,1);
		head=pushFront(head,2);
		head=pushFront(head,3);
		head=pushFront(head,4);
		printLinkedList(head);
		/*head=popFront(head);
		printLinkedList(head);*/
		pushBack(head,6);
		printLinkedList(head);
		popBack(head);
		printLinkedList(head);
	}
}