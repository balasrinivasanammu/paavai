package PaavaiDSpack;

class Stack {
    int top;
    int maxSize;
    int[] stackArray;

    Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return stackArray[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }
}

public class PaavaiStack1 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
    }
}

