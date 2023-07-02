/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2017S2;

import java.util.LinkedList;

/**
 *
 * @author Xin Jie
 */
public class Q4Queue<E> {
    LinkedList<E> list;
    
    public Q4Queue(E[] items){
        list = new LinkedList<>();
        for(E item : items)
            list.add(item);
    }
    
    public Q4Queue(){
        list = new LinkedList<>();
    }
    
    public void enqueue(E e){
        list.addLast(e);
    }
    
    public E dequeue(){
        if(list.isEmpty())
            return null;
        return list.pollFirst();
    }
    
    public E getElement(int i){
        if(list.isEmpty())
            return null;
        if(i<0 || i>=list.size())
            return null;
        return list.get(i);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
