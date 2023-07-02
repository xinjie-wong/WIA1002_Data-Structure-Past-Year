/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2017S2;

/**
 *
 * @author Xin Jie
 */
public class Q1LinkedList {
    Q1Node head;
    int size;
    
    public Q1LinkedList(){
        head = null;
        size = 0;
    }
    
    //insert a new element into the list as first element
    public void insertFirstLink(String e, int sales){
        if(head==null)
            head = new Q1Node(e, sales, null);
        else{
            Q1Node temp = head;
            for(int i=0; i<size-1; i++)
                temp = temp.nextNode;
            temp.nextNode = new Q1Node(e, sales, null);
        }
        size++;
    }
    
    //insert a new element after a particular element
    public boolean addAfter(String e, String element, int sales){
        if(head==null){
            System.out.println("The list is empty. No item is added...");
            return false;
        }else{
            Q1Node temp = head;
            int num = 1;
            while(temp!=null){
                if(temp.element.equals(element)){
                    System.out.printf("Adding %s after %s\n", e, element);
                    System.out.printf("Found %s which is handbag number %d in the linked list\n", element, num);
                    Q1Node newNode = new Q1Node(e, sales, temp.nextNode);
                    temp.nextNode = newNode;
                    size++;
                    return true;
                }
                temp = temp.nextNode;
                num++;
            }
        }
        System.out.printf("%s is not in the list...\n", element);
        return false;
    }
    
    //delete a particular element from the list
    public boolean removeLink(String e){
        if(head==null){
            System.out.println("The list is empty. No item is removed...");
            return false;
        }else{
            Q1Node temp = head;
            Q1Node prev = head;
            int num = 1;
            while(temp!=null){
                if(temp.element.equals(e)){
                    System.out.printf("Removing %s\n", e);
                    System.out.printf("Found a match.. %s is handbag number %d in the linked list\n", e, num);
                    prev.nextNode = temp.nextNode;
                    size--;
                    return true;
                }
                prev = temp;
                temp = temp.nextNode;
                num++;
            }
        }
        System.out.printf("%s is not found in the list. No item is removed..\n", e);
        return false;
    }
    
    //display all the elements in the list
    public void display(){
        System.out.println("Displaying the Linked List*************************************");
        if(size==0)
            System.out.println("The list is empty");
        else{
            Q1Node temp = head;
            while(temp!=null){
                System.out.printf("%s: %d Sold\n", temp.element, temp.sales);
                temp = temp.nextNode;
            }
        }
        System.out.println("");
    }
    
}
