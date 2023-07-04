/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2016S2;

/**
 *
 * @author Xin Jie
 */
public class Q1Day {
    
    private final String[] DAY_NAME = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
    public String displayDay(int num){
        if(num>0 && num<=7)
            return DAY_NAME[num-1];
        if(num>7){
            int n = num%7;
            if(n==0)
                return DAY_NAME[6];
            return DAY_NAME[n-1];
        }
        if(num==0)
            return DAY_NAME[6];
        return null;
    }
    
}
