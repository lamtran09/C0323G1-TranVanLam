package ss11_stack_queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Prime {

    Queue<Integer> integerQueue = new PriorityQueue<>();
    Stack<Integer> integerStack = new Stack<>();

    public Stack<Integer> getIntegerStack(int number) {
        for (int i = 0; i <= number; i++) {
            if (checkPrime(i)) {
                integerStack.push(i);
            }
        }
        return integerStack;
    }

    public Queue<Integer> getIntegerQueue(int number) {
        for (int i = 0; i <= number; i++) {
            if (checkPrime(i)) {
                integerQueue.add(i);
            }
        }
        return integerQueue;
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
