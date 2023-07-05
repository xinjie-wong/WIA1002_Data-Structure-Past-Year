/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2018;

/**
 *
 * @author Xin Jie
 */
public class Q4Node {
    String element;
    int hours;
    Q4Node next;
    
    public Q4Node(String element, int hours, Q4Node next){
        this.element = element;
        this.hours = hours;
        this.next = next;
    }
    
}
