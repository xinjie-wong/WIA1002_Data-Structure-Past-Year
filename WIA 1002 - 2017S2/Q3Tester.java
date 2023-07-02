/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2017S2;

/**
 *
 * @author Xin Jie
 */
public class Q3Tester {
    public static void main(String[] args) {
        Q3BST<Integer> tree = new Q3BST<>();

        tree.add(tree.root, 5);
        tree.add(tree.root, 3);
        tree.add(tree.root, 7);
        tree.add(tree.root, 2);
        tree.add(tree.root, 4);
                
        tree.printTreeInOrder();
        System.out.println("");

        System.out.println("Does the tree contain number '5'? " + tree.contains(5));
        System.out.println("\nDoes the tree contain number '6'? " + tree.contains(6));
    }
    
}
