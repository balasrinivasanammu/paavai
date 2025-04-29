package PaavaiDSpack;
//Class representing a node in a Binary Search Tree (BST)
class Node {
 int data;
 Node left, right;

 public Node(int value) {
     data = value;
     left = right = null;
 }
}

//Class representing the Binary Search Tree (BST)
class Paavai13thdayBST {
 // Function to insert a node into BST
 public Node insert(Node root, int value) {
     if (root == null) {
         return new Node(value);
     }

     if (value < root.data) {
         root.left = insert(root.left, value);
     } else if (value > root.data) {
         root.right = insert(root.right, value);
     }

     return root;
 }

 // In-order traversal (Left -> Root -> Right)
 public void inOrder(Node root) {
     if (root != null) {
         inOrder(root.left);
         System.out.print(root.data + " ");
         inOrder(root.right);
     }
 }

 public static void main(String[] args) {
	 Paavai13thdayBST bst = new Paavai13thdayBST();
     Node root = null;

     // Insert nodes into BST
     root = bst.insert(root, 50);
     bst.insert(root, 30);
     bst.insert(root, 70);
     bst.insert(root, 20);
     bst.insert(root, 40);
     bst.insert(root, 60);
     bst.insert(root, 80);

     // Print In-order traversal
     System.out.print("In-order Traversal: ");
     bst.inOrder(root);
 }
}



