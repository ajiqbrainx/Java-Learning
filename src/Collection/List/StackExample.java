package Collection.List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.add(1);
        num.add(2);
        System.out.println(num);
        num.push(23);
        System.out.println(num);
        num.pop();
        System.out.println(num);
        System.out.println(num.peek());

    }
}
