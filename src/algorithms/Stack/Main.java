package algorithms.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Stack s = new Stack();

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(2);
        stack.push(4);
        stack.push(9);
        stack.push(6);

        System.out.println(stack);
        // Tìm ele đầu stack
        System.out.println(stack.peek());
        //
        //stack.pop();
        System.out.println(stack);


        //
        System.out.println("search: " + stack.search(6));

        //
        System.out.println("size: " + stack.size());


    }
}
