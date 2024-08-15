import java.util.Scanner;

public class max_element {
    public class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    private Node root;
    Scanner sc=new Scanner(System.in);

    max_element()
    {
        root=GenerateTree();
    }
    public Node GenerateTree(){

        int item=sc.nextInt();
        Node nn=new Node(item);

        Boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=GenerateTree();
        }
        Boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=GenerateTree();
        }

        return nn;
    }
    public int maximum(){
        return maximum(root);
    }
    private int maximum(Node node)
    {
        if(node==null)
        {
            return Integer.MIN_VALUE;
        }

        int lmax=maximum(node.left);
        int rmax=maximum(node.right);

        return Math.max(Math.max(lmax,rmax),node.data);
    }
    public static void main(String[] args) {
        max_element bt=new max_element();
        System.out.println(bt.maximum());
    }
}
