package org.ks.algorithm;

import java.util.LinkedList;

/**
 * Created by Kevin on 2017/1/10.
 */
public class ImplementQueueUsingStacks {
    LinkedList<Integer> stack = new LinkedList<>();

    // Push element x to the back of queue.
    public void push(int x) {
        stack.add(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack.pop();
    }

    // Get the front element.
    public int peek() {
        return stack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.size() == 0 ? true : false;
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(queue.peek());
        System.out.println(queue.empty());
        queue.pop();
        System.out.println(queue);
    }
}
