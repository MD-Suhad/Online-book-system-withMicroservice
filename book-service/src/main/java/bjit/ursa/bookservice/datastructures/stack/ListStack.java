package bjit.ursa.bookservice.datastructures.stack;

import org.hibernate.internal.util.collections.Stack;

public abstract class ListStack<T> implements Iterable<T>, Stack<T> {

    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    //create an empty stack
    public ListStack(){};

    //create a stack with an initial element
    public ListStack(T firstElem){
        push(firstElem);
    }

    //return the number of elements in the stack
    public int size(){
        return list.size();
    }

    //check if the stack is empty
    public boolean isEmpty(){
        return size() == 0;
    }

    //push on element on the stack
    public void push(T elem){
        list.addLast(elem);
    }

    //pop on element off the stack
    //throw  an error is stack is empty
    public T pop(){
        if(isEmpty()) throw new java.util.EmptyStackException();
        return list.removeLast();
    }

    //peek the top of the stack without removing an element
    //throws an exception if stack is empty
    public T peek(){
        if(isEmpty()) throw new java.util.EmptyStackException();
        return list.peekLast();
    }

    //Search for the element starting from top of the stack
    //returns -1 if the element is not present is not stack
    public int search(T elem){
        return list.lastIndexOf(elem);
    }

    //allow user to iterate through the stack using an iterator
    @Override
    public java.util.Iterator<T> iterator(){
        return list.iterator();
    }
}
