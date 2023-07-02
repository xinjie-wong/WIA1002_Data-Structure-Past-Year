/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2019S2;

/**
 *
 * @author Xin Jie
 */
public class Q1Node<E extends Comparable<E>> {
    E element;
    Q1Node next;
    
    public Q1Node(E element, Q1Node next){
        this.element = element;
        this.next = next;
    }
    
}
