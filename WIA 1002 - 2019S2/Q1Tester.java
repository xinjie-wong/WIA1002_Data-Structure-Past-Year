/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2019S2;

/**
 *
 * @author Xin Jie
 */
public class Q1Tester {
    public static void main(String[] args) {
        Q1MyLinkedList<Integer> list1 = new Q1MyLinkedList<>();
        Q1MyLinkedList<Integer> list2 = new Q1MyLinkedList<>();
        Q1MyLinkedList<Integer> newList = new Q1MyLinkedList<>();
        
        list1.addLast(2);
        list1.addLast(10);
        list1.addLast(38);
        list1.addLast(41);
        list1.addLast(51);
        System.out.println("List One: ");
        System.out.println(list1.toString());
        System.out.println("");
        
        list2.addLast(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41);
        list2.addLast(56);
        System.out.println("List Two: ");
        System.out.println(list2.toString());
        System.out.println("");
        
        System.out.println("The newList is:");
        System.out.println(combine(list1, list2, newList).toString());

    }
    
    public static Q1MyLinkedList combine(Q1MyLinkedList list1, Q1MyLinkedList list2, Q1MyLinkedList newList){
        int sizeOne = 0;
        int sizeTwo = 0;
        Q1Node tempOne = list1.head;
        Q1Node tempTwo = list2.head;
        
        while(sizeOne!=list1.getSize() && sizeTwo!=list2.getSize()){
            if(tempOne.element.compareTo(tempTwo.element)<0){
                newList.addLast(tempOne.element);
                tempOne = tempOne.next;
                sizeOne++;
            }else if(tempOne.element.compareTo(tempTwo.element)>0){
                newList.addLast(tempTwo.element);
                tempTwo = tempTwo.next;
                sizeTwo++;
            }else{
                newList.addLast(tempOne.element);
                newList.addLast(tempTwo.element);
                sizeOne++;
                sizeTwo++;
                tempOne = tempOne.next;
                tempTwo = tempTwo.next;
            }
        }
        
        while(sizeOne!=list1.getSize()){
            newList.addLast(tempOne.element);
            tempOne = tempOne.next;
            sizeOne++;
        }
        
        while(sizeTwo!=list2.getSize()){
            newList.addLast(tempTwo.element);
            tempTwo = tempTwo.next;
            sizeTwo++;
        }
        
        return newList;
    }
    
}
