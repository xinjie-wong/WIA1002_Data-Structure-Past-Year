/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2020;


/**
 *
 * @author Xin Jie
 */
public class Q1<E> {
    private int items;   //size of the stack
    private E[] list;
    
    //default constructor
    public Q1(){
        items = 0;
    }
    
    public Q1(int size){
        list = (E[]) new Object[size];
    }
    
    //check is the stack is empty
    public boolean isEmpty(){
        if(items==0)
            return true;
        return false;
    }
    
    //check if the stack is full
    public boolean isFull(){
        return items >= list.length;
    }
    
    //return the top value of the stack
    public E peek(){
        if(!isEmpty()){
            return list[items-1];
        }
        return null;  
    }
    
    //add an element into the stack
    public void push(E e){
        if(!isFull()){
            list[items] = e;
            System.out.println("Push: " + e);
            items++;
        }else
            System.out.println("The stack is full...");
    }
    
    //add several elements at one time into the stack
    public void pushMany(String e){
        System.out.println("Push many into stack...");
        String[] element = e.split(",");
        for(String item : element){
            push((E) item);
        }
        System.out.println("");
    }
    
    //remove the top element from the stack
    public E pop(){
        if(!isEmpty()){
            E removed = list[items-1];
            items--;
            return removed;
        }else
            System.out.println("The stack is empty, no item is removed...");
        return null;
    }
    
    //remove the middle element from the stack
    public E popMiddle(){
        if(items%2!=0){
            int middle = items/2;
            E removed = list[middle];
            for(int i=middle; i<items-1; i++){
                list[i] = list[i+1];
            }
            items--;
            return removed;
        }
        return null;
    }
    
    //remove all element from the stack
    public void popAll(){
        if(!isEmpty()){
            System.out.printf("There are %d items in the stack. Pop all...\n", items);
            for(int i=items-1; i>=0; i--){
                System.out.println("Removing " + pop());
            }
        }else
            System.out.println("The stack is empty, nothing to be removed...");
        System.out.println("");
    }
    
    //display all elements in the stack
    public void display(){
        if(isEmpty())
            System.out.println("Stack is empty, nothing to display...");
        else{
            System.out.printf("There are %d items in the stack. Displaying...\n", items);
            for(int i=items-1; i>=0; i--){
                System.out.println(list[i]);
            }
        }
        System.out.println("");
    }
    
}
