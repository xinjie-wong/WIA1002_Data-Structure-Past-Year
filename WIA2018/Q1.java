/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2018;

import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author Xin Jie
 */
public class Q1 {
    private static Stack<Integer> poleOne = new Stack<>();
    private static Stack<Integer> poleTwo = new Stack<>();
    private static Stack<Integer> poleThree = new Stack<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of disks: ");
        int num = sc.nextInt();
        
        //push all the disks into the first rod
        for(int i = num; i>0; i--)
            poleOne.push(i);
        
        //display the initial condition of the rods
        System.out.println("\nInitial: ");
        display();
        System.out.println("-".repeat(70));
        
        //Tower of Hanoi
        TowerOfHanoi(num, poleOne, poleThree, poleTwo);
        
        System.out.println("-".repeat(70));
    }
    
    //display the disks in all the rods
    public static void display(){
        System.out.println("Pole One : " + poleOne.toString());
        System.out.println("Pole Two: " + poleTwo.toString());
        System.out.println("Pole Three: " + poleThree.toString());
        System.out.println("");
    }
    
    //Tower of Hanoi
    public static void TowerOfHanoi(int numOfDisk, Stack source, Stack destination, Stack middle){
        if(numOfDisk==1){
            destination.push(source.pop());
            display();
            return;
        }
        
        TowerOfHanoi(numOfDisk-1, source, middle, destination);
        destination.push(source.pop());
        display();
        TowerOfHanoi(numOfDisk-1, middle, destination, source);
    }
    
}
