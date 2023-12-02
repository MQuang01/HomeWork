package StackAndQueue.ex3;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<Integer> {
    private LinkedList<Integer> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(Integer num) {
        stack.addFirst(num);
    }

    public Integer pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return stack.size();
    }
}
