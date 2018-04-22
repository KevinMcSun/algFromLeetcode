package org.ks.algorithm;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Kevin on 2016/12/27.
 */
public class MinStack {
    /** initialize your data structure here. */
    LinkedList<Integer> stack = new LinkedList<>();
    LinkedList<Integer> minStack = new LinkedList<>();

    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.size() == 0)
            minStack.push(x);
        else {
            if (minStack.getFirst() >= x)
                minStack.push(x);
        }

    }

    public void pop() {
        int x = stack.pop();
        if (x == minStack.getFirst()){
            minStack.pop();
        }
    }

    public int top() {
        return stack.getFirst();
    }

    public int getMin() {
        return minStack.getFirst();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(-3);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
