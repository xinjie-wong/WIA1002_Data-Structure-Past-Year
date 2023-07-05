/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2018;

/**
 *
 * @author Xin Jie
 */
public class Q4LinkedList {
    private Q4Node head;
    private int size;
    
    //constructor
    public Q4LinkedList(){
        head = null;
        size = 0;
    }
    
    //check if the list is empty
    public boolean isEmpty(){
        return size==0;
    }
    
    //add element to the list
    public void add(String element, int hours){
        if(isEmpty())
            head = new Q4Node(element, hours, null);
        else{
            Q4Node newNode = new Q4Node(element, hours, head);
            head = newNode;
        }
        size++;
    }
    
    //add element after a specified element in the list
    public void addAfter(String after, String element, int hours){
        if(isEmpty())
            System.out.println("The list is empty, no item is added...");
        else{
            Q4Node temp = head;
            int i = 1;
            while(temp!=null){
                if(temp.element.equals(after)){
                    System.out.printf("Adding %s after %s\n", element, after);
                    System.out.printf("Found %s which is book number %d in the linked list\n", after, i);
                    Q4Node newNode = new Q4Node(element, hours, temp.next);
                    temp.next = newNode;
                    size++;
                    return;
                }
                i++;
                temp = temp.next;
            }
            System.out.printf("The book %s is not found in the linked list, no item is added...\n", after);
        }
    }
    
    //remove an element from the linked list
    public void remove(String element, int hours){
        if(isEmpty())
            System.out.println("The list is empty, no item is removed...");
        else{
            Q4Node temp = head;
            Q4Node prev = head;
            int i = 1;
            while(temp!=null){
                if(temp.element.equals(element)){
                    System.out.printf("Removing %s...\n", element);
                    System.out.printf("Found a match... %s is book number %d in the linked list\n", element, i);
                    prev.next = temp.next;
                    size--;
                    return;
                }
                i++;
                prev = temp;
                temp = temp.next;
            }
            System.out.printf("The book %s is not found in the linked list, no item is removed...\n", element);
        }
    }
    
    //calculate the total credit hours
    public void totalCreditHours(){
        int total = 0;
        Q4Node temp = head;
        while(temp!=null){
            total+=temp.hours;
            temp = temp.next;
        }
        System.out.println("Total credit hours taken: " + total);
    }
    
    //display all the elements in the list
    public void display(){
        System.out.println("Displaying the Linked List*****************************************************");
        if(isEmpty())
            System.out.println("The list is empty...");
        else{
            Q4Node temp = head;
            while(temp!=null){
                System.out.printf("%s: %d hours\n", temp.element, temp.hours);
                temp = temp.next;
            }
        }
    }
    
}
