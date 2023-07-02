/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2019S2;

/**
 *
 * @author Xin Jie
 */
public class Q2SalesList {
    
    private String region, salesRepresentativeName;
    private int salesAmount;
    
    //constructors
    public Q2SalesList(){
    }
    
    public Q2SalesList(String region, String salesRepresentativeName, int salesAmount){
        this.region = region;
        this.salesRepresentativeName = salesRepresentativeName;
        this.salesAmount = salesAmount;
    }

    public String getRegion() {
        return region;
    }

    public String getSalesRepresentativeName() {
        return salesRepresentativeName;
    }

    public int getSalesAmount() {
        return salesAmount;
    }
    
    @Override
    public String toString(){
        return String.format("%-15s%-5d%-8s", region, salesAmount, salesRepresentativeName);
    }
    
}
