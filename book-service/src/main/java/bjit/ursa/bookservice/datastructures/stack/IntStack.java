package bjit.ursa.bookservice.datastructures.stack;

import antlr.collections.Stack;

import java.util.NoSuchElementException;

public class IntStack implements Stack<Integer> {

    @Override
    public int height() {
        return 0;
    }

    @Override
    public Object pop() throws NoSuchElementException {
        return null;
    }

    @Override
    public void push(Object o) {

    }

    @Override
    public Object top() throws NoSuchElementException {
        return null;
    }
}
