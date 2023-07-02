/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2017S2;

/**
 *
 * @author Xin Jie
 */
public class Q1Node {
    String element;
    int sales;
    Q1Node nextNode;
    
    public Q1Node(String element, int sales, Q1Node nextNode){
        this.element = element;
        this.sales = sales;
        this.nextNode = nextNode;
    }
}
