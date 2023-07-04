/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2016S2;

/**
 *
 * @author Xin Jie
 */
public class Q4Tester {
    public static void main(String[] args) {
        Q4LinkedList list = new Q4LinkedList();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addAfter(11, 10);
        list.addAfter(21, 20);
        list.addAfter(31, 30);
        list.addAfter(41, 40);
        list.addAfter(51, 50);
        System.out.println("");
        
        list.traverse();
        System.out.println("");
        
        list.deleteFront();
        list.deleteFront();
        System.out.println("");
        
        list.traverse();
        System.out.println("");
        
        list.deleteAfter(40);
        list.deleteAfter(40);
        list.deleteAfter(31);
        list.deleteAfter(40);
        System.out.println("");
        
        list.traverse();
        
    }
    
}
