package PaavaiDSpack;

import java.util.Scanner;

//====== Singly Linked List ======
class SinglyLinkedList1 {
 class Node {
     int data;
     Node next;
     Node(int val) 
     { 
    	 data = val; 
    	 next = null; 
     }
 }
 Node head = null;

 void insert(int val) {
     Node newNode = new Node(val);
     if (head == null) 
    	 head = newNode;
     else 
     {
         Node temp = head;
         while (temp.next != null) 
        	 temp = temp.next;
         temp.next = newNode;
     }
 }

 void display() 
 {
     if (head == null) 
    	 System.out.println("Singly List is empty.");
     else 
     {
         Node temp = head;
         while (temp != null) 
         {
             System.out.print(temp.data + " -> ");
             temp = temp.next;
         }
         System.out.println("null");
     }
 }

 void delete() 
 {
     if (head == null) 
    	 System.out.println("List is empty.");
     else if (head.next == null) 
     {
         System.out.println("Deleted: " + head.data);
         head = null;
     } 
     else 
     {
         Node temp = head;
         while (temp.next.next != null) 
        	 temp = temp.next;
         System.out.println("Deleted: " + temp.next.data);
         temp.next = null;
     }
 }
}

//====== Doubly Linked List ======
class DoublyLinkedList1 
{
 class Node 
 {
     int data;
     Node prev, next;
     Node(int val) 
     { 
    	 data = val; 
    	 prev = next = null; 
     }
 }
 Node head = null;

 void insert(int val) 
 {
     Node newNode = new Node(val);
     if (head == null) 
    	 head = newNode;
     else 
     {
         Node temp = head;
         while (temp.next != null) temp = temp.next;
         temp.next = newNode;
         newNode.prev = temp;
     }
 }

 void display() 
 {
     if (head == null) 
    	 System.out.println("Doubly List is empty.");
     else 
     {
         Node temp = head;
         while (temp != null) 
         {
             System.out.print(temp.data + " <-> ");
             temp = temp.next;
         }
         System.out.println("null");
     }
 }

 void delete() 
 {
     if (head == null) 
    	 System.out.println("List is empty.");
     else if (head.next == null) 
     {
         System.out.println("Deleted: " + head.data);
         head = null;
     } 
     else 
     {
         Node temp = head;
         while (temp.next != null) temp = temp.next;
         System.out.println("Deleted: " + temp.data);
         temp.prev.next = null;
     }
 }
}

//====== Circular Linked List ======
class CircularLinkedList1 {
 class Node {
     int data;
     Node next;
     Node(int val) 
     { 
    	 data = val; 
     }
 }
 Node head = null;

 void insert(int val) 
 {
     Node newNode = new Node(val);
     if (head == null) 
     {
         head = newNode;
         newNode.next = head;
     } 
     else 
     {
         Node temp = head;
         while (temp.next != head) temp = temp.next;
         temp.next = newNode;
         newNode.next = head;
     }
 }

 void display() 
 {
     if (head == null) 
     {
         System.out.println("Circular List is empty.");
         return;
     }
     Node temp = head;
     do 
     {
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     } while (temp != head);
     System.out.println("(back to head)");
 }

 void delete() 
 {
     if (head == null) 
    	 System.out.println("List is empty.");
     else if (head.next == head) 
     {
         System.out.println("Deleted: " + head.data);
         head = null;
     } 
     else 
     {
         Node temp = head;
         while (temp.next.next != head) temp = temp.next;
         System.out.println("Deleted: " + temp.next.data);
         temp.next = head;
     }
 }
}

//====== Main Menu Program ======
public class LinkedListProgramend {
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);
     SinglyLinkedList1 sll = new SinglyLinkedList1();
     DoublyLinkedList1 dll = new DoublyLinkedList1();
     CircularLinkedList1 cll = new CircularLinkedList1();

     int choice, subChoice, val;

     do {
         System.out.println("\nChoose Linked List Type:");
         System.out.println("1. Singly Linked List");
         System.out.println("2. Doubly Linked List");
         System.out.println("3. Circular Linked List");
         System.out.println("4. Exit");
         System.out.print("Choice: ");
         choice = sc.nextInt();

         switch (choice) 
         {
             case 1:
                 do {
                     System.out.println("\nSingly Linked List Operations:");
                     System.out.println("1. Insert at end");
                     System.out.println("2. Display");
                     System.out.println("3. Delete from end");
                     System.out.println("4. Back");
                     subChoice = sc.nextInt();
                     switch (subChoice) {
                         case 1:
                             System.out.print("Enter value: ");
                             val = sc.nextInt();
                             sll.insert(val);
                             break;
                         case 2:
                             sll.display();
                             break;
                         case 3:
                             sll.delete();
                             break;
                     }
                 } while (subChoice != 4);
                 break;

             case 2:
                 do {
                     System.out.println("\nDoubly Linked List Operations:");
                     System.out.println("1. Insert at end");
                     System.out.println("2. Display");
                     System.out.println("3. Delete from end");
                     System.out.println("4. Back");
                     subChoice = sc.nextInt();
                     switch (subChoice) {
                         case 1:
                             System.out.print("Enter value: ");
                             val = sc.nextInt();
                             dll.insert(val);
                             break;
                         case 2:
                             dll.display();
                             break;
                         case 3:
                             dll.delete();
                             break;
                     }
                 } while (subChoice != 4);
                 break;

             case 3:
                 do {
                     System.out.println("\nCircular Linked List Operations:");
                     System.out.println("1. Insert at end");
                     System.out.println("2. Display");
                     System.out.println("3. Delete from end");
                     System.out.println("4. Back");
                     subChoice = sc.nextInt();
                     switch (subChoice) {
                         case 1:
                             System.out.print("Enter value: ");
                             val = sc.nextInt();
                             cll.insert(val);
                             break;
                         case 2:
                             cll.display();
                             break;
                         case 3:
                             cll.delete();
                             break;
                     }
                 } while (subChoice != 4);
                 break;

             case 4:
                 System.out.println("Exiting program...");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }
     } while (choice != 4);
     sc.close();
 }
}

