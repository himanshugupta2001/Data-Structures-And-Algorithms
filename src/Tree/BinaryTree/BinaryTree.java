package Tree.BinaryTree;

class Node {   //node creation
    Node left, right;
    int key;
    public Node(int item)
    {
        key = item;
        left = right = null;
    }

}  //node creation complete
public class BinaryTree {
    Node root;

    BinaryTree()  //constructor
    {
        root = null;
    }

    void preorder(Node node) //preorder traversal
    {
        if (node == null)
            return;
        System.out.println(node.key);
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node) //inorder traversal
    {
        if (node == null)
            return;
        System.out.println(node.left);
        System.out.println(node.key);
        inorder(node.right);
    }

    void postorder(Node node) //postorder traversal
    {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.key);
    }

    void preorder() {
        preorder(root);
    }

    void inorder() {
        inorder(root);
    }

    void postorder() {
        postorder(root);
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("preorder traversal");
        tree.preorder();
        System.out.println("inorder traversal");
        tree.inorder();
        System.out.println("postorder traversal");
        tree.postorder();
    }
}





