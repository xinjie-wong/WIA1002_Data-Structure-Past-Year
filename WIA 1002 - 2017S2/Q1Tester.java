/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2017S2;

/**
 *
 * @author Xin Jie
 */
public class Q1Tester {
    public static void main(String[] args) {
        Q1LinkedList list = new Q1LinkedList();
        list.insertFirstLink("Louis Vuitton", 10000000);
        list.insertFirstLink("Chanel", 100000000);
        list.insertFirstLink("Prada", 1000000);
        list.insertFirstLink("Tods", 500000000);
        System.out.println("");
        list.display();
        
        list.addAfter("Coach", "Chanel", 10000000);
        System.out.println("");
        list.display();
        
        list.addAfter("Mulberry", "Coach", 90000000);
        System.out.println("");
        list.display();
        
        list.removeLink("Chanel");
        System.out.println("");
        list.display();
        
        list.removeLink("Coach");
        System.out.println("");
        list.display();
        
    }
    
}