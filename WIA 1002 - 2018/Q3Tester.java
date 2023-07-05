/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2018;

/**
 *
 * @author Xin Jie
 */
public class Q3Tester {
    public static void main(String[] args) {
        Q3Stack<String> stack1 = new Q3Stack<>(4);
        stack1.push("one");
        stack1.push("two");
        stack1.push("three");
        stack1.push("four");
        stack1.displayInReverse();
        stack1.popAll();
        stack1.displayInReverse();
        
        System.out.println("");
        
        Q3Stack<String> stack2 = new Q3Stack<>(4);
        stack2.push("one");
        stack2.push("two");
        stack2.push("three");
        stack2.push("four");
        System.out.println(stack2.peek());
        stack2.display();
        stack2.displayInReverse();
        stack2.popAll();
        
        System.out.println("");
        
        Q3Stack<Integer> stack3 = new Q3Stack<>(4);
        stack3.push(100);
        stack3.push(200);
        stack3.push(300);
        stack3.push(400);
        System.out.println(stack3.peek());
        stack3.display();
        stack3.displayInReverse();
        stack3.popAll();
    }
    
}
