/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2018;

/**
 *
 * @author Xin Jie
 */
public class Q3Stack<E> {
    
    private E[] stack;
    private int size;
    
    //constructor
    public Q3Stack(int num){
        stack = (E[]) new Object[num];
        size = 0;
    }
    
    //check if the stack is empty
    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
    
    //return the first element in the stack
    public E peek(){
        if(size==0)
            return null;
        else
            return stack[size-1];
    }
    
    //add element to the top of the stack
    public void push(E e){
        System.out.println("Push item into stack: " + e);
        stack[size] = e;
        size++;
    }
    
    //remove element from the top of the stack
    public void pop(){
        if(size!=0){
            System.out.println("Removing " + stack[size-1] + "...");
            stack[size-1] = null;
            size--;
        }
    }
    
    //remove all the elements from the stack
    public void popAll(){
        if(size!=0){
            System.out.println("Pop all item in stack: ");
            for(int i=size-1; i>=0; i--){
                System.out.println("Removing " + stack[i] + "...");
                stack[i] = null;
            }
            size = 0;
        }else
            System.out.println("The stack is empty...");
    }
    
    //display all elements in the stack
    public void display(){
        System.out.println("Display stack : ");
        for(int i=0; i<stack.length; i++){
            System.out.println(stack[i]);
        }
    }
    
    //display all the elements in the stack in reversed order
    public void displayInReverse(){
        System.out.println("Display stack in reverse: ");
        for(int i=stack.length-1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
    
}
