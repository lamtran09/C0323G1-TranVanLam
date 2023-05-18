package ss10_dsa.bai_tap.method_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    /**
     * @creator: Lâm
     * @date : 18/05/2023
     */
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }


    /**
     * ensureCapacity dùng bảo đảm độ dài của mảng
     * @creator: Lâm
     */
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public void addElements(int index, E element) {
        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        System.out.println(element);
        size++;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    /**
     * coming soon
     *
     * @param index
     * @return
     */
    public E remove(int index) {

        return null;
    }

    /**
     * coming soon
     *
     * @return
     */
    public int size() {

        return 0;
    }

    /**
     * coming soon
     *
     * @return
     */
    public E clone() {

        return null;
    }

    public boolean contains(E o) {

        return false;
    }

    public int indexOf(E o) {

        return 0;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
             elements[i] = null;
        }
        size--;
    }
}