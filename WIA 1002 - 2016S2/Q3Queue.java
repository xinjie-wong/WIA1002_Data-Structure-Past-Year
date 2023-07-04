/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2016S2;

import java.util.LinkedList;

/**
 *
 * @author Xin Jie
 */
public class Q3Queue<E> {
    private LinkedList<E> list;
    
    //constructor
    public Q3Queue(){
        list = new LinkedList<>();
    }
    
    //check if the queue is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    //return the size of the queue
    public int size(){
        return list.size();
    }
    
    //return the value of the first element in the queue
    public E peek(){
        if(!list.isEmpty())
            return list.getFirst();
        return null;
    }
    
    //add element to the botton of the queue
    public void enqueue(E e){
        list.addLast(e);
    }
    
    //remove element from the top of the queue
    public void dequeue(){
        list.removeFirst();
    }
    
    //display the element in the queue
    @Override
    public String toString(){
        return list.toString();
    }
    
    public void ChangeOrder(int k){
        for(int i=1; i<k; i++){
            E item = peek();
            dequeue();
            enqueue(item);
        }
    }
}
