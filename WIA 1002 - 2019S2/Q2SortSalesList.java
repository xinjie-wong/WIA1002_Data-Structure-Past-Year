/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2019S2;

/**
 *
 * @author Xin Jie
 */
public class Q2SortSalesList {
    
    //sort region in descending order
    public Q2SalesList[] SelectionSort(Q2SalesList[] list){
        for(int i=0; i<list.length-1; i++){
            String max = list[i].getRegion();
            int maxIndex = i;
            for(int j = i+1; j<list.length; j++){
                if(max.compareTo(list[j].getRegion())<0){
                    max = list[j].getRegion();
                    maxIndex = j;
                }
            }
            if(maxIndex!=i){
                Q2SalesList temp = list[i];
                list[i] = list[maxIndex];
                list[maxIndex] = temp;
            }
        }
        return list;
    }
    
    //sort salesAmount in ascending order
    public Q2SalesList[] InsertionSort(Q2SalesList[] list){
        for(int i=1; i<list.length; i++){
            int min = list[i].getSalesAmount();
            Q2SalesList temp = list[i];
            int j;
            for(j=i-1; j>=0 && list[j].getSalesAmount()>min;j--){
                list[j+1] = list[j];
            }
            list[j+1] = temp;
        }
        return list;
    }
    
    //sort salesRepresentativeName in ascending order
    public Q2SalesList[] BubbleSort(Q2SalesList[] list){
        boolean needPass = true;
        for(int i=1; i<list.length && needPass; i++){
            needPass = false;
            for(int j=0; j<list.length-i; j++){
                if(list[j].getSalesRepresentativeName().compareTo(list[j+1].getSalesRepresentativeName())>0){
                    Q2SalesList temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needPass = true;
                }
            }
        }
        return list;
    }

}
