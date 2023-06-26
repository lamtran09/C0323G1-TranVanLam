package demo;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);
        for (Integer i : numbers) {
            System.out.println(i );
        }
    }
}
