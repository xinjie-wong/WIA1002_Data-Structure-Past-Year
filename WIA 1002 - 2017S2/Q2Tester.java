/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2017S2;

import java.util.Scanner;

/**
 *
 * @author Xin Jie
 */
public class Q2Tester {
    public static void main(String[] args) {
        Q2Stack s = new Q2Stack();
        System.out.println("isEmpty() returns " + s.isEmpty());
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Push 3 books to the pile: ");
        for(int i=1; i<4; i++){
            System.out.printf("Enter book title %d: ", i);
            String book = sc.nextLine();
            s.push(book);
        }
        System.out.println("");
        
        s.toString();
        System.out.println("");
        
        System.out.println("The pile should not be empty: ");
        System.out.println("isEmtpy() returns " + s.isEmpty());
        System.out.printf("The pile has %d books\n", s.getSize());
        System.out.println("");
        
        System.out.println("Get the top book and remove the top book;");
        System.out.println("");
        
        while(!s.isEmpty()){
            System.out.printf("%s is at the top of the pile\n", s.peek());
            System.out.printf("%s is removed from the pile\n", s.pop());
            System.out.println("");
        }
        
        System.out.println("The stack should be empty");
        System.out.println("isEmpty() returns " + s.isEmpty());
    }
    
}
