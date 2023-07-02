/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2019S2;


/**
 *
 * @author Xin Jie
 */
public class Q2Tester {
    public static void main(String[] args) {        
        Q2SortSalesList sort = new Q2SortSalesList();
        Q2SalesList[] list = new Q2SalesList[7];
        list[0] = new Q2SalesList("Asia", "Ahmad", 450);
        list[1] = new Q2SalesList("Europe", "Hemish", 518);
        list[2] = new Q2SalesList("Europe", "Banny", 650);
        list[3] = new Q2SalesList("Greenland", "Ain", 200);
        list[4] = new Q2SalesList("Asia", "Ali", 390);
        list[5] = new Q2SalesList("GreenLand", "Ben", 670);
        list[6] = new Q2SalesList("Asia", "Lee", 790);
        
        System.out.println("Original Data: ");
        for(Q2SalesList slist : list)
            System.out.println(slist.toString());
        System.out.println("");
        
        System.out.println("Sorting Result on Region using SelectionSort: ");
        for(Q2SalesList slist : sort.SelectionSort(list))
            System.out.println(slist.toString());
        System.out.println("");
        
        System.out.println("Sorting Result on Sales using InsertionSort: ");
        for(Q2SalesList slist : sort.InsertionSort(list))
            System.out.println(slist.toString());
        System.out.println("");
        
        System.out.println("Sorting Result on SalesRep using BubbleSort: ");
        for(Q2SalesList slist : sort.BubbleSort(list))
            System.out.println(slist.toString());
        System.out.println("");
    }
    
}
