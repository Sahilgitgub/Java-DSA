import java.util.*;

public class Tree {
    public class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public Tree() { // Constructor with the class name Tree
        root = GenerateTree(); //kyuki root private h aur private sirf private function ko accesiible hota h isliye
    }

    private Node GenerateTree() {
        System.out.println("Enter node data:");
        int item = sc.nextInt();
        Node nn = new Node(item);

        System.out.println("Has left child? (true/false):");
        Boolean hlc = sc.nextBoolean();
        if (hlc) {
            System.out.println("Please enter the left child: ");
            nn.left = GenerateTree();
        }

        System.out.println("Has right child? (true/false):");
        Boolean hrc = sc.nextBoolean();
        if (hrc) {
            System.out.println("Please enter the right child: ");
            nn.right = GenerateTree();
        }
        return nn;
    }

    public void Display() {
        Display(root);
    }

    private void Display(Node node) {
        if (node == null) {
            return;
        }
        String s = "";

        if (node.left != null) {
            s += node.left.data + " <- ";
        } else {
            s += ". <- ";
        }

        s += node.data;

        if (node.right != null) {
            s += " -> " + node.right.data;
        } else {
            s += " -> .";
        }

        System.out.println(s);

        Display(node.left);  // Recursively display left subtree
        Display(node.right); // Recursively display right subtree
    }

    public static void main(String[] args) {
        Tree bt = new Tree();
        bt.Display();
    }
}
