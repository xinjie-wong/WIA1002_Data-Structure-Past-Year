/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2018;

/**
 *
 * @author Xin Jie
 */
public class Q2Tester {
    public static void main(String[] args) {
        Q2Queue q = new Q2Queue(5);
        
        q.enqueue("hello");
        q.enqueue("all");
        q.enqueue("who");
        q.enqueue("wants");
        q.enqueue("ice cream");
        q.dequeue();
        q.dequeue();
        q.enqueue("1000");
        q.enqueue("2000");
        q.peek();
        
        q.display();
    }
    
}
