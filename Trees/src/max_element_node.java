import java.util.Scanner;

public class max_element_node {
    public class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    private Node root;
    Scanner sc=new Scanner(System.in);

    max_element_node()
    {
        root=GenerateTree();
    }
    public Node GenerateTree()
    {
        int item=sc.nextInt();
        Node nn=new Node(item);

        System.out.println("has left child? (true/false): ");
        Boolean hlc=sc.nextBoolean();
        if(hlc)
        {
            System.out.println("Enter the element: ");
            nn.left=GenerateTree();
        }

        System.out.println("has right child? (true/false): ");
        Boolean hrc=sc.nextBoolean();

        if(hrc)
        {
            System.out.println("Enter the element: ");
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
            return;
        String s="";
        s+=node.data;
        s="<-"+s+"->";

        if(node.left!=null)
        {
            s=node.left.data+s;
        }
        else {
            s="."+s;
        }

        if(node.right!=null){
            s=node.right.data+s;
        }
        else{
            s="."+s;
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }
    public Boolean find(int item)
    {
        return find(root,item);
    }

    private Boolean find(Node node,int item)
    {
        if(node==null)
        {
            return false;
        }
        if(node.data==item)
        {
            return true;
        }
        Boolean left=find(node.left,item);
        Boolean right=find(node.right,item);
        return left || right;

    }
    public static void main(String[] args) {
        max_element_node bt=new max_element_node();
        bt.Display();
        System.out.println(bt.find(80));
    }
}
