/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2020;

/**
 *
 * @author Xin Jie
 */
public class Q3 {
    
    private int size;
    private Q3Node head;
    
    //default constructor
    public Q3(){
        size = 0;
        head = null;
    }
    
    //check if the linked list is empty
    public boolean isEmpty(){
        return size==0;
    }
    
    //add an element into the linked list
    public void createNode(String e, int n){
        if(head==null)
            head = new Q3Node(e, n, null);
        else{
            Q3Node newNode = new Q3Node(e, n, head);
            head = newNode;
        }
        size++;
    }
    
    //add an element after an existing element
    public boolean addAfter(String current, String after, int n){
        Q3Node temp = head;
        int i = 1;
        while(temp!=null){
            if(temp.info.equals(current)){
                Q3Node newNode = new Q3Node(after, n, temp.next);
                temp.next = newNode;
                System.out.println("Adding " + after + " after " + current);
                System.out.println("Found " + current + " which is book number " + i + " in the linked list");
                System.out.println("");
                display();
                return true;
            }
            temp = temp.next;
            i++;
        }
        System.out.println(current + " is not found. " + after + " is not added.\n");
        return false;
    }
    
    //remove an element from the linked list
    public boolean removeNode(String e){
        System.out.println("Removing " + e + "...");
        Q3Node temp = head;
        Q3Node previous = head;
        int i = 1;
        while(temp!=null){
            if(temp.info.equals(e)){
                if(temp==head){
                    head = temp.next;
                }else{
                    previous.next = temp.next;
                }
                System.out.println(e + " is the book number " + i + ". Removing " + e + " from the linked list\n");
                size--;
                return true;
            }
            previous = temp;
            temp = temp.next;
            i++;
        }
        System.out.println("Couldn't find bookname...\n");
        return false;
    }
    
    //display the elements in the linked list
    public void display(){
        System.out.println("Displaying the Linked List ********************************************************************");
        Q3Node temp = head;
        while(temp!=null){
            System.out.println(temp.info + ": " + totalSales(temp) + " Sold");
            temp = temp.next;
        }
        System.out.println("");
    }
    
    //calculate the total sale collected
    public int totalSales(Q3Node node){
        int totalSales = (int) node.sales*1000000;
        return totalSales;
    }
    
}
