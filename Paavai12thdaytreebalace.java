package PaavaiDSpack;


class Node1 {
 int data;
 Node1 left, right;

 public Node1(int item) {
     data = item;
     left = right = null;
 }
}

public class Paavai12thdaytreebalace {

 Node1 root;

 // Helper class to return height and balance status together
 static class TreeInfo {
     boolean isBalanced;
     int height;

     TreeInfo(boolean isBalanced, int height) {
         this.isBalanced = isBalanced;
         this.height = height;
     }
 }

 // Main function to check if tree is balanced
 public TreeInfo isBalanced(Node1 node) {
     if (node == null)
         return new TreeInfo(true, 0);

     TreeInfo left = isBalanced(node.left);
     TreeInfo right = isBalanced(node.right);

     boolean currentBalanced = left.isBalanced && right.isBalanced &&
                                Math.abs(left.height - right.height) <= 1;

     int currentHeight = Math.max(left.height, right.height) + 1;

     return new TreeInfo(currentBalanced, currentHeight);
 }

 public static void main(String[] args) {
	 Paavai12thdaytreebalace tree = new Paavai12thdaytreebalace();


     tree.root = new Node1(1);
     tree.root.left = new Node1(2);
     tree.root.right = new Node1(3);
     tree.root.left.left = new Node1(4);
     tree.root.left.right = new Node1(5);

     // Check if tree is balanced
     if (tree.isBalanced(tree.root).isBalanced) {
         System.out.println("The tree is balanced!");
     } else {
         System.out.println("The tree is not balanced!");
     }
 }
}

