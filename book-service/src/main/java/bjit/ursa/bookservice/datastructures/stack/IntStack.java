package bjit.ursa.bookservice.datastructures.stack;

import org.yaml.snakeyaml.util.ArrayStack;

import java.util.ArrayDeque;


public class IntStack implements Stack<Integer> {

    private int[] ar;
    private int pos = 0;

    //maxSize is the maximum number of items
    //that can be in the queue at any given time
    public IntStack(int maxSize){
        ar = new int[maxSize];
    }

    //return the number of elements insize the stack
    public int size(){
        return pos;
    }

    //Returns true/false on whether the stack is empty
    public boolean isEmpty(){
        return pos == 0;
    }

    //Return the element at the top of the stack
    @Override
    public Integer peek(){
        return ar[pos-1];
    }

    //Add an element to the top of the stack
    @Override
    public void push(Integer value){
        ar[pos++] = value;
    }

    //Make sure you check that the stack is not empty before calling pop!
    @Override
    public Integer pop(){
        return ar[--pos];
    }

                  //Example//
    public static void main(String[] args){
        IntStack s = new IntStack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()) System.out.println(s.pop());
        benchMarkTest();
    }
     //BenchMark IntStack vs arrayDeque
    public static void benchMarkTest(){
        int n = 10000000;
        IntStack intStack = new IntStack(n);
        //IntStack time at around 0.0324 seconds
        long start = System.nanoTime();
        for(int i = 0; i < n; i++) intStack.push(i);
        for(int i = 0; i < n; i++) intStack.pop();
        long end = System.nanoTime();
        System.out.println("IntStack Time:" +(end - start)/1e9);

        //arrayDeque times at around 1.438 seconds
        //java.util.arrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>():
        //java.util.stack<Integer> arrayDeque = new java.util.Stack<>():
        java.util.ArrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>(n);

        //arrayQueue is slower when you give it an initial capacity
        start = System.nanoTime();
        for(int i = 0; i < n; i++) arrayDeque.push(i);
        for(int i = 0; i < n; i++) arrayDeque.pop();
        end = System.nanoTime();
        System.out.println("ArrayDeque TIme" +(end-start)/1e9);


//        Stack<Integer> listStack = new ListStack<>();
//        start = System.nanoTime();
//        for(int i = 0; i < n; i++) listStack.push(i);
//        for(int i = 0; i < n; i++) listStack.pop();
//        end = System.nanoTime();
//        System.out.println("ListStack Time:" +(end - start)/1e9);
//
//        Stack<Integer> arrayStack = new ArrayStack<>();
//        start = System.nanoTime();
//        for(int i = 0; i < n; i++) listStack.push(i);
//        for(int i = 0; i < n; i++) listStack.pop();
//        end = System.nanoTime();
//        System.out.println("arrayStack Time:" +(end - start)/1e9);
    }
}
