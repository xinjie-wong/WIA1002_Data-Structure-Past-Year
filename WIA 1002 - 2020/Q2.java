/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2020;

/**
 *
 * @author Xin Jie
 */
public class Q2<E> {
    private int items;
    private E[] list;
    
    //default constructor
    public Q2(){
        items = 0;
    }
    
    public Q2(int size){
        list = (E[]) new Object[size];
    }
    
    //check if the queue is empty
    public boolean isEmpty(){
        return items==0;
    }
    
    //check if the queue is full
    public boolean isFull(){
        return items==list.length;
    }
    
    //return the first value in the queue
    public E peek(){
        if(!isEmpty())
            return list[items];
        return null;
    }
    
    //add an element into the queue
    public void enqueue(E e){
        if(!isFull()){
            list[items] = e;
            System.out.println("Enqueue: " + e);
            items++;
        }else
            System.out.println("The queue is full...");
    }
    
    public void enqueueMany(String e){
        String[] items = e.split(",");
        for(Object item : items)
            enqueue((E) item);
    }
    
    //remove an element from the queue
    public void dequeue(){
        if(!isEmpty()){
            System.out.println("Dequeue: " + list[0]);
            for(int i=0; i<items-1; i++){
                list[i] = list[i+1];
            }
            items--;
        }else
            System.out.println("The queue is empty...");
    }
    
    //remove all the elements in the queue
    public void dequeueAll(){
        if(!isEmpty()){
            System.out.printf("There are %d items in the queue. Removing them all...\n", items);
            while(!isEmpty()){
                dequeue();
            }
        } 
        System.out.println("");
    }
    
    //change the order of the elements
    public void changeOrder(int k){
        System.out.println("Change queue order...\n");
        E[] temp = (E[]) new Object[k-1];
        for(int i = 0; i<k-1; i++){
            temp[i] = list[i];
        }
        for(int i=0; i<(items-k+1); i++){
            list[i] = list[i+k-1];
        }
        int num = items-k+1;
        for (E temp1 : temp) {
            list[num] = temp1;
            num++;
        }
    }
    
    //display the elements in the queue
    public void display(){
        if(isEmpty())
            System.out.println("Nothing to display");
        else{
            System.out.printf("There are %d items in the queue. Displaying...\n", items);
            for(int i=0; i<items; i++){
                System.out.print(list[i] + " | ");
            }
            System.out.println("\n");
        }
    }
    
}
