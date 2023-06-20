/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2020;

/**
 *
 * @author Xin Jie
 */
public class Q1Tester {
    public static void main(String[] args) {
        Q1<String> stack1 = new Q1<>(7);
        stack1.push("apple");
        System.out.println("");
        stack1.display();
        stack1.pushMany("broccoli,chicken sandwich,donut,french fries,juice,muruku");
        stack1.display();
        System.out.println("Pop the top of the stack: " + stack1.pop());
        System.out.println("Pop the top of the stack: " + stack1.pop());
        System.out.println("");
        stack1.display();
        System.out.println("Pop middle of the stack: " + stack1.popMiddle());
        System.out.println("");
        stack1.display();
        System.out.println("Pop middle of the stack: " + stack1.popMiddle());
        System.out.println("================================================");
        
        Q1<Integer> stack2 = new Q1<>(10);
        stack2.push(1);
        stack2.push(2);
        System.out.println("");
        stack2.pushMany("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();
    }
    
}
