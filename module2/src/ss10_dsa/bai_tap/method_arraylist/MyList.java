package ss10_dsa.bai_tap.method_arraylist;

import java.util.ArrayList;

public class MyList<E> {
    private int size = 0;
    private static  final int DEFAULT_CAPACITY =10;
    private Object elements[];
    public MyList(){
            elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    public  void add(int index,E element){

    }
    public E remove(int index){

        return null;
    }
    public int size(){

        return 0;
    }
    public  E clone(){

        return null;
    }
    public boolean contains(E o){

        return false;
    }
    public int indexOf(E o){

        return 0;
    }
    public boolean add(E o){

        return false;
    }
    public  void  ensureCapacity(int minCapacity){

    }
    public E get(int i){

        return null;
    }
    public  void clear(){

    }
}
