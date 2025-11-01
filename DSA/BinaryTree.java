public class BinaryTree {
    public static void main(String args[]){
        Node root = null;
        BinaryTreeOperations bto = new BinaryTreeOperations();
        bto.insert(3);
        bto.insert(1);
        bto.insert(4);
        bto.insert(2);
        root = bto.root;
        
        
        System.out.println("Inorder Traversal:");
        BinaryTreeOperations.inorderTraversal(root);
        System.out.println("\nPreorder Traversal:");
        BinaryTreeOperations.preorderTraversal(root);
        System.out.println("\nPostorder Traversal:");
        BinaryTreeOperations.postorderTraversal(root);
    }
}

class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTreeOperations{
    
    Node root;

    public void insert(int data){
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data){
        if(root == null)
        root = new Node(data);

        else if(data < root.data)
            root.left = insertRec(root.left, data);
        else
            root.right = insertRec(root.right, data);

        return root;
    }

    public static void inorderTraversal(Node root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void preorderTraversal(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void postorderTraversal(Node root){
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }
    
   
}