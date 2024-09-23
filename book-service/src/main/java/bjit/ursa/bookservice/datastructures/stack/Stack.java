package bjit.ursa.bookservice.datastructures.stack;

public interface Stack<T>{
    //return a number of elements  in the stack
    public int size();

    //return if the stack is empty
    public boolean isEmpty();

    //push the element off the stack
    public void push(T elem);

    //pop the element off the stack
    public T pop();

    public T peek();
}
