/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2020;

/**
 *
 * @author Xin Jie
 */
public class Q2Tester {
    public static void main(String[] args) {
        Q2<String> q = new Q2<>(10);
        q.enqueue("Dom T");
        q.enqueue("Rafa N");
        q.enqueueMany("Roger F,Daniil M,Novak D,Alex Z,Stef T,Karen K");
        System.out.println("");
        q.display();
        q.dequeue();
        q.enqueue("Matt B");
        q.enqueue("Kei N");
        System.out.println("");
        q.display();
        q.dequeueAll();
        q.display();
        System.out.println("======================================");
        
        Q2<Integer> q2 = new Q2<>(10);
        q2.enqueue(10);
        q2.enqueue(20);
        q2.enqueueMany("30,40,50,60,70,80,90");
        System.out.println("");
        q2.display();
        q2.changeOrder(5);
        q2.display();
    }
    
}
