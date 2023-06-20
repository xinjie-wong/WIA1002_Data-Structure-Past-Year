/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2020;

/**
 *
 * @author Xin Jie
 */
public class Q3Tester {
    public static void main(String[] args) {
        Q3 myLL = new Q3();
        myLL.createNode("Lord of The Rings", 500);
        myLL.createNode("Tale of the Body Thief", 1);
        myLL.createNode("Memnoch the Devil", 100);
        myLL.createNode("Heart of a Samurai", 10);
        myLL.display();
        myLL.addAfter("Memnoch the Devil", "White Crane", 10);
        myLL.addAfter("White Crane", "Memoirs of a Gesha", 90);
        myLL.removeNode("Harry Potter");
        myLL.removeNode("Heart of a Samurai");
        myLL.display();
        
    }
    
}
