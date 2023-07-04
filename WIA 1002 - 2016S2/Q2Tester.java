/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2016S2;

/**
 *
 * @author Xin Jie
 */
public class Q2Tester {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = "(x,y;z)";
        str[1] = "(area<un[der{the}curv]e>nothing)";
        str[2] = "(DS-{is[my>]}";
        str[3] = "][";
        str[4] = "datastructure";
        
        Q2 q = new Q2();
        for(String s : str){
           if(q.BracMatch(s)==1)
               System.out.println("YES - all matched!");
           else if (q.BracMatch(s)==-1)
                System.out.println("Not all brackets are matched");
           else
                System.out.println("There is no bracket in the input");
        }
    }
    
}
