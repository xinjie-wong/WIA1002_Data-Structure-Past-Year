/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2016S2;

/**
 *
 * @author Xin Jie
 */
public class Q4LinkedList {
    private Q4Node head;
    private int size;
    
    public Q4LinkedList(){
        head = null;
        size = 0;
    }
    
    //insert a new element into the linked list
    public void add(int num){
        System.out.println("Adding: " + num);
        if(size==0)
            head = new Q4Node(num, null);
        else{
            Q4Node temp = head;
            for(int i=1; i<size; i++)
                temp = temp.next;
            temp.next = new Q4Node(num, null);
        }
        size++;
    }
    
    //insert a new element after a particular element in the linked list
    public void addAfter(int num, int after){
        if(size==0)
            System.out.println("The linked list is empty...");
        else{
            Q4Node current = head;
            while(current!=null){
                if(current.element == after){
                    System.out.printf("Adding %d after %d\n", num, after);
                    Q4Node newNode = new Q4Node(num, current.next);
                    current.next = newNode;
                    size++;
                    return;
                }
                current = current.next;
            }
            System.out.printf("The value %d is not in the linked list\n", after);
        }
    }
    
    //delete the first element in the linked list
    public void deleteFront(){
        if(size==0)
            System.out.println("The linked list is empty...");
        else{
            System.out.println("Deleting front: " + head.element);
            head = head.next;
            size--;
        }
    }
    
    //delete an element after element with value x in the linked list
    public void deleteAfter(int x){
        System.out.println("Testing deleteAfter: ");
        if(size==0)
            System.out.println("The linked list is empty...");
        else{
            Q4Node temp = head;
            while(temp!=null){
                if(temp.element == x){
                    System.out.printf("After %d is %d. Deleting %d\n", temp.element, temp.next.element, temp.next.element);
                    temp.next = temp.next.next;
                    size--;
                    return;
                }
                temp = temp.next;
            }
            System.out.printf("Element (%d) not found...\n", x);
        }
    }
    
    //display all the elements in the linked list
    public void traverse(){
        System.out.println("Showing content of my linked list: ");
        if(size==0)
            System.out.println("The linked list is empty...");
        else{
            Q4Node temp = head;
            while(temp!=null){
                System.out.print(temp.element + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
    
}
