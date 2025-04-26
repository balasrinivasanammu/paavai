package PaavaiDSpack;

import java.util.Stack;

public class Paavai10thdayStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack: " + stack); // Output: [Apple, Banana, Cherry]

        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // Output: Cherry

        // Pop the top element
        stack.pop();
        System.out.println("Stack after pop: " + stack); // Output: [Apple, Banana]
    }
}
