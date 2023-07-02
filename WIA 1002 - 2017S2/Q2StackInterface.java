/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package WIA2017S2;

import java.util.ArrayList;

/**
 *
 * @author Xin Jie
 */
public interface Q2StackInterface<E> {
   
    //return the number of elements in the stack
    public int getSize();
    
    //return the top element in the stack
    public E peek();
    
    //return and remove the top element in the stack
    public E pop();
    
    //add a new element into the stack
    public void push(E e);
    
    //check if the stack is empty
    public boolean isEmpty();
    
    
}
