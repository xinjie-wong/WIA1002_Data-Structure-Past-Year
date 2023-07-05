/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2018;

/**
 *
 * @author Xin Jie
 */
public class Q2Queue {
    
    private String[] queue;
    private int size;
    
    //constructor
    public Q2Queue(int num){
        queue = new String[num];
        size = 0;
    }
    
    //check if the queue is empty
    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
    
    //return the value of the first element in the queue
    public void peek(){
        if(size==0)
            System.out.println("Peak() : null, the queue is empty");
        else
            System.out.printf("Peak() : %s\n", queue[0]);
    }
    
    //add element to the bottom of the queue
    public void enqueue(String e){
        System.out.printf("Data %s inserted\n", e);
        if(size==0)
            queue[0] = e;
        else{
            if(size!=queue.length)
                queue[size] = e;
            else{
                System.out.println("The queue is full. Item is not added. ");
                size--;
            }
        }
        size++;
    }
    
    //remove the element from the top of the queue
    public void dequeue(){
        if(size!=0){
            System.out.printf("Data %s has been removed\n", queue[0]);
            for(int i=1; i<size; i++){
                queue[i-1] = queue[i];
            }
            size--;
        }
    }
    
    //display all the elements in the queue
    public void display(){
        System.out.println("-".repeat(70));
        System.out.print("|");
        for(int i=0; i<size; i++){
            System.out.printf("   %d   |", i);
        }
        System.out.println("");
        System.out.println("-".repeat(70));
        System.out.print("|");
        for(int i=0; i<size; i++){
            System.out.printf("   %s   |", queue[i]);
        }
        System.out.println("");
        System.out.println("-".repeat(70));
    }
}
