package bjit.ursa.bookservice.datastructures.queue;

public class LinkedQueue<T> implements Iterable<T>,Queue<T> {

    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    public LinkedQueue(){}

    public LinkedQueue(T firstElem){
        offer(firstElem);
    }

    //return the size of the queue
    public int size(){
        return list.size();
    }

    //returns whether or not the queue is empty

    public boolean isEmpty(){
        return size() == 0;
    }

    //peek the element at the front of the queue
    //the method throw is the queue is empty
    public T peek(){
        if(isEmpty()) throw new RuntimeException("Queue Empty");
        return list.peekFirst();
    }

    //pool an element from the front of the queue
    //the method throw an error is the queue is empty

    public  T poll(){
        if(isEmpty()) throw new RuntimeException("queue is empty");
        return list.removeFirst();


    }
    //add an element to the back of the queue

    public void offer(T elem){
        list.addLast(elem);
    }

    //return an iterator to alow the user to traverse
    //through the elements fround inside the queue

    @Override
    public java.util.Iterator<T> iterator(){
        return  list.iterator();
    }

}
