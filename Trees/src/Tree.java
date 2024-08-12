import java.util.Scanner;

public class Tree{
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
    Tree()
    {
        root=GenerateTree();
    }

    public Node GenerateTree()
    {
        int item=sc.nextInt();
        Node nn=new Node(item);
        Boolean hlc = sc.nextBoolean();
        if(hlc)
        {
            System.out.println("Enter left Child: ");
            nn.left=GenerateTree();
        }

        Boolean hrc=sc.nextBoolean();
        if(hrc)
        {
            System.out.println("Enter right child: ");
            nn.right=GenerateTree();
        }
        return nn;
    }

    public void Display()
    {
        Display(root);
    }

    private void Display(Node node)
    {
        if(node==null)
        {
            return;
        }

        String s="";
        if(node.left!=null)
        {
            s=s+node.left.data+"<-";
        }
        else {
            s+=".<-";
        }

        if(node.right!=null)
        {
            s+=node.right+data+"<-";
        }
        else{
            s+=".<-";
        }
        Display(node.left);
        Display(node.right);
    }
    public static void main(String[] args) {
        Tree bt=new Tree();
        bt.Display();
    }
}