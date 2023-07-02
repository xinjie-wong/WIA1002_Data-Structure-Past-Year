/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2017S2;

/**
 *
 * @author Xin Jie
 */
public class Q3Node<E> {
    E element;
    Q3Node<E> left;
    Q3Node<E> right;
    
    public Q3Node(E element){
        this.element = element;
        left = null;
        right = null;
    }
    
}
