package demo;

import java.util.Queue;

public class ArrayDeque {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.ArrayDeque<>();
        queue.add(3);
        queue.add(8);
        queue.add(2);
        queue.add(1);
        for (Integer i: queue) {
            System.out.println(i);
        }
    }
}
