package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> nuevaPila = new Stack<>();
        nuevaPila.push("Smith");
        nuevaPila.push("Montessori");
        nuevaPila.push("Peralta");
        nuevaPila.push("House");
        return nuevaPila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> laPilaStack = createStack();
        printAndEmptyStack(laPilaStack);

        }

}




