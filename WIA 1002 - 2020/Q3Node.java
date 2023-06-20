/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2020;

/**
 *
 * @author Xin Jie
 */
public class Q3Node {
    String info;
    int sales;
    Q3Node next;
    
    public Q3Node(String info, int sales, Q3Node next){
        this.info = info;
        this.sales = sales;
        this.next = next;
    }

    public int getSales() {
        return sales;
    }
    
}
