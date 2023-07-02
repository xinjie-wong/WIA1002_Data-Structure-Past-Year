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
public class Q4Tester {
    public static void main(String[] args) {
        String[] characters = {"a", "b", "c", "d", "e", "f", "g", 
                         "h", "i", "j", "k", "l", "m", "n", 
                         "o", "p", "q", "r", "s", "t", "u",
                         "v", "w", "x", "y", "z"};
        
        Q4Queue<String> queue = new Q4Queue<>(characters);
        System.out.println("Queue: " + queue.toString());
        
        Q4Queue<Integer> index = new Q4Queue<>();
        for(int i=0; i<27; i++){
            index.enqueue(i);
        }
        System.out.println("Index: " + index.toString());
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times will you enter a number: ");
        int num = sc.nextInt();
        System.out.println("(Please enter your number(s) between 0-26)");
        
        Q4Queue<String> list = new Q4Queue<>();
        Q4Queue<Integer> in = new Q4Queue<>();
        for(int i=1; i<=num; i++){
            System.out.print("Enter number " + i + ">> ");
            int input = sc.nextInt();
            in.enqueue(input);
            list.enqueue(queue.getElement(input));
        }
        
        System.out.println("The entered numbers are " + in.toString());
        
        System.out.print("The deciphered values are ");
        if(list.isEmpty())
            System.out.println("-Cannot decipher. No value was entered-");
        else{
            String[] s = list.toString().split(", ");
            for(String str : s)
                System.out.print(str);
        }
        System.out.println("");
        
    }
    
}
