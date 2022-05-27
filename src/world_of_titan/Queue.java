package world_of_titan;

import java.util.LinkedList;

public class Queue<E> {
    LinkedList<E> list = new LinkedList();
    
    public void enqueue(E e) {
        list.addLast(e);
    }
    
    public E dequeue() {
        return list.removeFirst();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public E peek() {
        return list.element();
    }    
    
    public int getSize() {
        return list.size();
    }    
}
