/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2016S2;

/**
 *
 * @author Xin Jie
 */
public class Q3Tester {
    public static void main(String[] args) {
        Q3Queue<Integer> queue = new Q3Queue<>();
        
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for(int i : num)
            queue.enqueue(i);
        
        System.out.println("The queue : " + queue.toString());
        
        queue.ChangeOrder(4);
        System.out.println("The queue (after changing the order) : " + queue.toString());
        
    }
    
}
