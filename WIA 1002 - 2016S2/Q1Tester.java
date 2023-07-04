/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2016S2;

import java.util.Scanner;

/**
 *
 * @author Xin Jie
 */
public class Q1Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1Day day = new Q1Day();
        
        System.out.println("1 for Monday");
        System.out.println("2 for Tuesday");
        System.out.println("3 for Wednesday");
        System.out.println("4 for Thursday");
        System.out.println("5 for Friday");
        System.out.println("6 for Saturday");
        System.out.println("7 for Sunday\n");
        System.out.print("Specify your day in number: ");
        int num = sc.nextInt();
        
        System.out.println("The name of the day is : " + day.displayDay(num));
        System.out.printf("The following day of %s is : %s\n", day.displayDay(num), day.displayDay(num+1));
        System.out.printf("The previous day of %s is : %s\n", day.displayDay(num), day.displayDay(num-1));
        System.out.printf("How many days to add to the specified/current day (%s) : ", day.displayDay(num));
        int input = sc.nextInt();
        num+=input;
        System.out.printf("The new day after the addition of %d day(S) is : %s\n", input, day.displayDay(num));
    }
    
}
