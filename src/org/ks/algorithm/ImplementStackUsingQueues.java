package org.ks.algorithm;

import java.util.LinkedList;

/**
 * Created by Kevin on 2017/1/10.
 */
public class ImplementStackUsingQueues {
    LinkedList<Integer> queue = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        queue.push(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.pop();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.size() == 0 ? true : false;
    }
}
