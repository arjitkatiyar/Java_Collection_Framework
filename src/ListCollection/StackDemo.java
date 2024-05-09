package ListCollection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();  //creating empty stack in the memory

        stack.push("Ironman");  //push method used to add elements in stack.
        stack.push("Thor");
        stack.push("Captain");
        stack.push("Loki");
        stack.push("Hulk");

        System.out.println(stack);

        System.out.println(stack.peek()); // peek shows the top element of stack.

        stack.pop();            //pop method used to remove elements in stack it automatically removes element from top of stack.
        System.out.println(stack);

    }
}
