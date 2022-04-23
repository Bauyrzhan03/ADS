package com.company;
import java.util.*;
public class MyQueue<T extends Comparable<T>> {
    private LinkedList<T> linkedList;
    public MyQueue() {
        linkedList = new LinkedList<T>();
    }
    public int size() {
        return linkedList.size();
    }
    public boolean isEmpty() {
        return linkedList.size() == 0;
    }
    public T enqueue(T item){
        linkedList.add(item);
        return item;
    }
}