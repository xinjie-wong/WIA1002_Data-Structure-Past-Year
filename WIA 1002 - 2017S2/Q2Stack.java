/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2017S2;

import java.util.ArrayList;

/**
 *
 * @author Xin Jie
 */
public class Q2Stack<E> implements Q2StackInterface<E>{
    ArrayList<E> list;
    
    //constructor
    public Q2Stack(){
        System.out.println("Create a new stack: an empty pile of books");
        list = new ArrayList<>();
    }
    
    //return the number of elements in the stack
    @Override
    public int getSize(){
        return list.size();
    }
    
    //return the top element in the stack
    @Override
    public E peek(){
        if(list.isEmpty()){
            System.out.println("The stack is empty");
            return null;
        }
        return list.get(list.size()-1);
    }
    
    //return and remove the top element in the stack
    @Override
    public E pop(){
        if(list.isEmpty()){
            System.out.println("The stack is empty");
            return null;
        }
        return list.remove(list.size()-1);
    }
    
    //add a new element into the stack
    @Override
    public void push(E e){
        list.add(e);
    }
    
    //check if the stack is empty
    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        String s = "The books in the pile are: " + list.toString();
        return s;
    }

}
