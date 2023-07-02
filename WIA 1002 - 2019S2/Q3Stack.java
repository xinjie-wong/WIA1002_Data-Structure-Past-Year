/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2019S2;

import java.util.ArrayList;

/**
 *
 * @author Xin Jie
 */
public class Q3Stack<E> {
    ArrayList<E> list;
    
    public Q3Stack(){
        list = new ArrayList<>();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public void push(E e){
        list.add(e);
    }
    
    public E pop(){
        if(isEmpty())
            return null;
        return list.remove(list.size()-1);
    }
    
    public E peek(){
        if(isEmpty())
            return null;
        return list.get(list.size()-1);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
}
