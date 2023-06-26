package demo;

import java.util.Queue;

public class LinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(10);
        queue.add(15);
        queue.add(20);
        for (Integer i : queue) {
            System.out.println(i);
        }
    }
}
