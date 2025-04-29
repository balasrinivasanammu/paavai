package PaavaiDSpack;

//Node class
class Node11 {
 int data;
 Node11 left, right;

 public Node11(int item) {
     data = item;
     left = right = null;
 }
}

public class Paavai12thdaytreeheightsame {

 Node11 root1, root2;

 // Method to calculate height of a tree
 int height(Node11 node) {
     if (node == null)
         return 0;
     
     int leftHeight = height(node.left);
     int rightHeight = height(node.right);
     return Math.max(leftHeight, rightHeight) + 1;
     
     }

 // Method to check if two trees have same height
 boolean sameHeight(Node11 node1, Node11 node2) {
     return height(node1) == height(node2);
 }

 public static void main(String[] args) {
	 Paavai12thdaytreeheightsame tree = new Paavai12thdaytreeheightsame();

     tree.root1 = new Node11(1);
     tree.root1.left = new Node11(2);
     tree.root1.right = new Node11(3);
     tree.root1.left.right = new Node11(4);

 
     tree.root2 = new Node11(10);
     tree.root2.left = new Node11(20);
     tree.root2.right = new Node11(30);
     

     // Check if both trees have same height
     if (tree.sameHeight(tree.root1, tree.root2)) {
         System.out.println("Both trees have the same height!");
     } else {
         System.out.println("Trees have different heights!");
     }
 }
}

