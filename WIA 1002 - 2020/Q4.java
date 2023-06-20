/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2020;


/**
 *
 * @author Xin Jie
 */
public class Q4 {
    Q4Entry[] list;
    private int size;
    
    //default constructor
    public Q4(){
        list = new Q4Entry[10];     //setting 10 as default capacity
        size = 0;
    }
    
    //return the key
    public Q4Entry get(String e){
        if(size==0)
            return null;
        
        for(int i=0; i<size; i++){
            if(list[i].getKey().equals(e))
                return list[i];
        }
        return null;
    }
    
    //add or update a new value for the key
    public void put(String key, String value){
        if(size==0){
            list[0] = new Q4Entry(key, value);
        }else{
            //check if the key exists
            for(int i=0; i<size; i++){
                //if key existx, update the value
                if(list[i].getKey().equals(key))
                    list[i].setValue(value);
            }
            //if key doesn't exists, create a new entry
            list[size] = new Q4Entry(key, value);
        }
        size++;
    }
    
}
