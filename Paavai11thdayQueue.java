package PaavaiDSpack;

/*import java.util.LinkedList;
import java.util.Queue;

public class Paavai11thdayQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //Queue<String> qu1=new Queue<>();
        // Enqueue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Pineapple");

        // Peek at front
        System.out.println("Front element: " + queue.peek());

        // Dequeue
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}*/

/*
//part 2 - Queue using array
import java.util.LinkedList;
import java.util.Queue;

public class Paavai11thdayQueue {
    int size, front = -1, rear = -1;
    int[] queue;

    public Paavai11thdayQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int value) {//10,20,30,40,50,
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1)
            {
            	front = 0;
            }
            queue[++rear] = value;//0->10,1->20,2->30,3->40,4->50
            System.out.println("Inserted: " + value);
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Removed: " + queue[front++]);
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    	Paavai11thdayQueue q = new Paavai11thdayQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
        q.dequeue();
        q.display();
    }
}
*/

// part 3 - Priority Queue

/*
import java.util.PriorityQueue;
import java.util.Queue;// set in python

public class Paavai11thdayQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(-400);
        pq.add(-400);
        

        System.out.println("PriorityQueue: " + pq);
       while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}*/





// part 4- Deque using ArrayDeQueue
import java.util.ArrayDeque;
import java.util.Deque;

public class Paavai11thdayQueue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");
        deque.add("D");
        deque.add("E");
        

        System.out.println("Deque: " + deque);

        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        System.out.println("Deque after removals: " + deque);
    }
}


// part 5 Queue using 2 stacks

/*import java.util.Stack;

public class Paavai11thdayQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int value) {
        stack1.push(value);
    }

    int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
    	Paavai11thdayQueue q = new Paavai11thdayQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
    }
}*/


