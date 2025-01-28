package Mine.StackVsHeap;


import java.util.Scanner;

public class StackVsHeap {
    public static void main(String[] args) {
        int x = 5; // x is stored on the stack
        String name = "John"; // name is stored on the stack (reference to a String object in the heap)
        Object obj = new Object(); // obj is stored on the stack (reference to an Object in the heap)

        // String literal - goes to String Pool (part of heap)
        String name1 = "John";

// Dynamic string - goes to heap (not pool)
        String name2 = new String("John");

// Dynamic string from user input - goes to heap (not pool)
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        String firstName = "John";  //pool
        String lastName = "Doe";   //pool
// Dynamic string from concatenation - goes to heap (not pool)
        String fullName = firstName + " " + lastName;  // New string in heap

// StringBuilder operations - result in heap (not pool)
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        String result = sb.toString();  // New string in heap
    }
}