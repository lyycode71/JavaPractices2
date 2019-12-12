class Node{
    char value;
    Node left;
    Node right;

    public Node(char value){
        this.value=value;
        left=right=null;
    }
}
public class BinaryTree {
    public static int size=0;
    public static int num=0;
    //private Node root=null;
    //前序遍历
    public void preOrder(Node root){
        //终止条件 空树
        if(root==null){
            return;
        }
        else{
            //递推
            //根
            System.out.print(root.value);
            //左子树
            preOrder(root.left);
            //右
            preOrder(root.right);
        }
    }
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.value);
            inOrder(root.right);
        }
    }
    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value);
        }
    }
    public void getSize1(Node root){

        if(root!=null){
            getSize1(root.left);
            getSize1(root.right);
            size++;
        }
    }
    public int getSize2(Node root){
        if(root==null){
            return 0;
        }else if(root.left==null||root.right==null){
            return 1;
        }else {
            return getSize2(root.left) + getSize2(root.right) + 1;
        }
    }
    public void getLeafSize1(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null) {
            ++num;
            return;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }//子问题思路
    //左右子树思路

    public int getLeafSize2(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null) {
            return 1;
        }else{
            return getLeafSize2(root.left)+getLeafSize2(root.right);
        }
    }
    public int getKLevelSize(Node root,int k){
        if(root==null){
            return 0;
        }
        if(k==1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }
    public Node buildTree(){
        Node root=new Node('A');
        Node node1=new Node('B');
        Node node2=new Node('C');
        Node node3=new Node('D');
        root.left=node1;
        node1.left=node2;
        node1.right=node3;
        return root;
    }

    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        tree.inOrder(tree.buildTree());
        System.out.println();
        tree.preOrder(tree.buildTree());
        System.out.println();
        tree.postOrder(tree.buildTree());
        System.out.println();
        tree.getSize1(tree.buildTree());
        System.out.println(tree.size);
        System.out.println(tree.getLeafSize2(tree.buildTree()));
    }
}
