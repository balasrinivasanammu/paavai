package PaavaiDSpack;

class Node1000 {
    int key;
    Node1000 left, right;

    public Node1000(int item) {
        key = item;
        left = right = null;
    }
}
class BST {
    Node1000 root;
    public BST() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node1000 insertRec(Node1000 root, int key) {
        if (root == null) {
            root = new Node1000(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node1000 deleteRec(Node1000 root, int key) {
        if (root == null)
            return root;
        if (key < root.key) {        	
            root.left = deleteRec(root.left, key);
        }
        else if (key > root.key) {        	
            root.right = deleteRec(root.right, key);            
        }
        else {        	
            if (root.left == null) 
            	return root.right;
            else if (root.right == null)
            	 return root.left;   
        }
       
        return root;
    }

    
    // Inorder traversal (for testing)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node1000 root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}
public class Paavai13thdayBSToperations {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.println("Delete 20");
        tree.delete(20);
        tree.inorder();

        
    }
}

