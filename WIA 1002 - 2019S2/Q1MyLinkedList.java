/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2019S2;

/**
 *
 * @author Xin Jie
 */
public class Q1MyLinkedList<E extends Comparable<E>>{
    Q1Node head;
    Q1Node tail;
    int size;
    
    //constructor
    public Q1MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    //return the size of the linked list
    public int getSize(){
        return size;
    }
    
    //add a node to the first position of the linked list
    public void addFirst(E e){
        if(size==0)
            head = tail = new Q1Node<>(e, null);
        else{
            Q1Node newNode = new Q1Node<>(e, head);
            head = newNode;
        }
        size++;
    }
    
    //add a node to the last position of the linked list
    public void addLast(E e){
        if(size==0)
            head = tail = new Q1Node<>(e, null);
        else{
            Q1Node temp = head;
            Q1Node previous = head;
            while(temp!=null){
                previous = temp;
                temp = temp.next;
            }
            previous.next = new Q1Node<>(e, null);
            tail = previous.next;
        }
        size++;
    }
    
    //remove the first node in the linked list
    public E removeFirst(){
        if(size==0)
            return null;
        Q1Node temp = head;
        head = temp.next;
        size--;
        return (E) temp.element;
    }
    
    @Override
    public String toString(){
        String sizeStr = ("[size=" + this.size + "]");
        String listStr = "";
        if(size!=0){
            Q1Node temp = head;
            while(temp!=null){
                listStr+=(" >> " + temp.element);
                temp = temp.next;
            }
        }
        return sizeStr + listStr;
    }
    
}
