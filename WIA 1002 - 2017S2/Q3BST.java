/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2017S2;

import java.util.Stack;

/**
 *
 * @author Xin Jie
 */
public class Q3BST<E extends Comparable<E>> {
    Q3Node<E> root;
    int size;
    
    public Q3BST(){
        root = null;
        size = 0;
    }
    
    public boolean add(Q3Node<E> node, E item){
        if(!contains(item)){
            if(node==null){
                root = new Q3Node(item);
                size++;
                return true;
            }
            if(item.compareTo(node.element)<0){
                if(node.left!=null)
                    add(node.left, item);
                else{
                    node.left = new Q3Node(item);
                    size++;
                    return true;
                }
            }else if(item.compareTo(node.element)>0){
                if(node.right!=null)
                    add(node.right, item);
                else{
                    node.right = new Q3Node(item);
                    size++;
                    return true;
                }
            }
        }
        return false;
    }
    
    public void printTreeInOrder(){
        if(root == null)
            System.out.println("The tree is empty");
        else{
            System.out.print("The tree in in-order: ");
            Stack<Q3Node<E>> s = new Stack();
            Q3Node<E> temp = root;
            while(temp!=null || !s.empty()){
                if(temp!=null){
                    s.push(temp);
                    temp = temp.left;
                }else{
                    temp = s.pop();
                    System.out.print(temp.element + " ");
                    temp = temp.right;
                }
            }
            System.out.println("");
        }
    }
    
    public boolean contains(E item){
        Q3Node<E> temp = root;
        while(temp!=null){
            if(item.compareTo(temp.element)<0)
                temp = temp.left;
            else if(item.compareTo(temp.element)>0)
                temp = temp.right;
            else if(item.compareTo(temp.element)==0)
                return true;
        }
        return false;
    }
    
}
