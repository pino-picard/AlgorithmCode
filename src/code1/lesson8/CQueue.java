package code1.lesson8;

import java.util.Stack;

class CQueue {
    Stack<Integer> appendStack;
    Stack<Integer> deleteStack;

    public CQueue() {
        appendStack = new Stack<>();
        deleteStack = new Stack<>();
    }

    public void appendTail(int value) {
        while(!deleteStack.empty()) {
            appendStack.push(deleteStack.pop());
        }
        appendStack.push(value);
    }

    public int deleteHead() {
        while(!appendStack.empty()) {
            deleteStack.push(appendStack.pop());
        }

        return deleteStack.empty() ? -1 : deleteStack.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */