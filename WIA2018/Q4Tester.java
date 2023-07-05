/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2018;

/**
 *
 * @author Xin Jie
 */
public class Q4Tester {
    public static void main(String[] args) {
        Q4LinkedList list = new Q4LinkedList();
        
        list.add("Computer Mathematics I", 3);
        list.add("Principles of AI", 3);
        list.add("Programming I", 5);
        list.add("Data Structure", 5);
        System.out.println("");
        
        list.display();
        System.out.println("");
        
        list.totalCreditHours();
        System.out.println("");
        
        list.addAfter("Programming I", "Software Architecture", 4);
        list.addAfter("Software Architecture", "Networking", 4);
        System.out.println("");
        
        list.display();
        System.out.println("");
        
        list.totalCreditHours();
        System.out.println("");
        
        list.remove("Networking", 4);
        list.remove("Principles of AI", 3);
        System.out.println("");
        
        list.display();
        System.out.println("");
        
        list.totalCreditHours();
        System.out.println("");
        
        
        
    }
    
}
