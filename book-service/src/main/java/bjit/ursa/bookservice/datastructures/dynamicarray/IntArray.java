package bjit.ursa.bookservice.datastructures.dynamicarray;

import java.util.Iterator;

public class IntArray implements Iterable<Integer> {

    private static final int DEFEULT_CAP = 1 << 3;
    public int[] arr;
    public int len = 0;
    private int capacity = 0;
    ///Initialize the array with a default capacity
        public  IntArray() throws IllegalAccessException {
        this(DEFEULT_CAP);
    }

    ///Initialize the array with a certain capacity
        public IntArray(int capacity) throws IllegalAccessException {
        if(capacity < 0) throw new IllegalAccessException("Illegal Capacity" + capacity);
        this.capacity = capacity;
        arr = new int[capacity];
        System.out.println("---array--"+arr);
    }

    //Given an array make it a dynamic array!
        public IntArray(int[] array) throws IllegalAccessException {
        if(array == null) throw new IllegalAccessException("Array can not be null");
        arr = java.util.Arrays.copyOf(array,array.length);
        capacity = len = array.length;
    }

    //Return the size of the array
        public int size(){
        return len;
        }

    //return true & false on whether the array is empty
        public boolean isEmpty(){
            return len == 0;
        }

    //To get/set values without method call overhead you can do
    //array_obj.arr[index] instead, you can gain about 10x the speed

        public int get(int index){
            return arr[index];
        }
        public void set(int index,int elem){
            arr[index] = elem;
        }

    // add an element to this dynamic array
        public void add(int elem){
            if(len + 1  >= capacity){
                if(capacity == 0) capacity = 1;
                else capacity = capacity*2;  //double the size
                arr = java.util.Arrays.copyOf(arr,capacity);
            }
            arr[len++] = elem;
        }

    // Removes the elements at the specified index in this list
    // if possible, avoid calling this method as it take 0(N) time
        public boolean remove(int elem){
            for(int i = 0; i < len; i++){
                if(arr[i] == elem){
                    remove(i);
                    return  true;
                }
            }
            return false;
        }

    // reverse the contents of this array
        public void reverse(){
            for(int i = 0; i < len/2; i++){
                int tmp = arr[i];
                arr[i] = arr[len - i - 1];
                arr[len - i -1] = tmp;
            }
        }

    // perform a binary search on this array to find an element in o(log(n)) time
    // make sure this array is sorted! returns a value < 0 if item is not found
        public int binarySearch(int key){
            int index = java.util.Arrays.binarySearch(arr,0,len,key);
            return index;
        }

    //sort this array
        public void sort(){
            java.util.Arrays.sort(arr,0,len);
        }

    // Iterator is still fast but not as fast as iterative for loop

        public java.util.Iterator<Integer> Iterator(){
            return new java.util.Iterator<Integer>(){
                int index = 0;
                public boolean hasNext(){
                    return index < len;
                }
                public Integer next() {
                    return null;
                }
                public void remove(){
                    throw new UnsupportedOperationException();
                }

            };


    }
        @Override
        public String toString(){
            if(len == 0) return "[]";
            else{
                StringBuilder sb = new StringBuilder(len).append("[");
                for(int i = 0; i < len -1; i++) sb.append(arr[i] + ",   ");
                return sb.append(arr[len - 1] + "]").toString();

            }
        }

        //Example usage
        public static  void main(String[] args) throws IllegalAccessException {
            IntArray ar = new IntArray(50);
            ar.add(1);
            ar.add(2);
            ar.add(3);
            ar.add(-4);
        }






























    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
