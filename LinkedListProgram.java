package PaavaiDSpack;

import java.util.Scanner;

public class LinkedListProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList singly = new SinglyLinkedList();
        DoublyLinkedList doubly = new DoublyLinkedList();
        CircularLinkedList circular = new CircularLinkedList();

        while (true) {
            System.out.println("\nChoose Linked List Type:");
            System.out.println("1. Singly Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Circular Linked List");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    singly.menu();
                    break;
                case 2:
                    doubly.menu();
                    break;
                case 3:
                    circular.menu();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}

// Singly Linked List
class SinglyLinkedList {
    class Node {
        int data;
        Node next;
    }

    Node head = null;
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\nSingly Linked List Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Back");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    void insert() {
        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
    }

    void delete() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Deleted: " + head.data);
            head = head.next;
        }
    }

    void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

// Doubly Linked List
class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
    }

    Node head = null;
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\nDoubly Linked List Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Back");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    void insert() {
        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        if (head != null)
        {
        	head.prev = newNode;
        }
        head = newNode;
    }

    void delete() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Deleted: " + head.data);
            head = head.next;
            if (head != null) head.prev = null;
        }
    }

    void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

// Circular Linked List
class CircularLinkedList {
    class Node {
        int data;
        Node next;
    }

    Node head = null;
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\nCircular Linked List Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Back");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    void insert() {
        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();
        Node newNode = new Node();
        newNode.data = val;
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }

    void delete() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == head) {
            System.out.println("Deleted: " + head.data);
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != head) temp = temp.next;
            System.out.println("Deleted: " + temp.next.data);
            temp.next = head;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}

