public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        System.out.println(list);
        list.reset();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        System.out.println(list);
        list.popFront();
        list.popFront();
        list.popFront();
        System.out.println(list);

        list.popFront();
        System.out.println(list);
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        System.out.println(list);
        list.popBack();
        list.popBack();
        list.popBack();
        System.out.println(list);
        list.popBack();
        System.out.println(list);
        list.popBack();
    }



   /* public static void testCopyList() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node nHead = CopyList.copy(n1);
        System.out.println(nHead);
    }


    public static void main(String[] args) {
        RNode n1 = new RNode(1);
        RNode n2 = new RNode(2);
        RNode n3 = new RNode(3);
        RNode n4 = new RNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n1.random = n2;
        n2.random = n1;
        n3.random = n3;

        RNode nHead = CopyRList.copy(n1);
        System.out.println("Hello");
    }*/
}
