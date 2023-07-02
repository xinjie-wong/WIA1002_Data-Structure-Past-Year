/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2019S2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xin Jie
 */
public class Q3Tester {
    
    static Q3Stack<Q3Node> s = new Q3Stack<>();
    static String[][] maze;
    static boolean[][] visited;

    public static void main(String[] args) throws FileNotFoundException {
        
        //read file and build the maze
        Scanner sc = new Scanner(new FileReader("Q3Maze.txt"));
        System.out.println("The Triwizard Maze:");
        String str = "";
        int row = 0;
        int column = 0;
        while(sc.hasNextLine()){
            row++;
            String s = sc.nextLine();
            str+=s;
            str+=" ";
            column = s.split(" ").length;
            System.out.println(s);
        }
        String[] string = str.split(" ");
        maze = new String[row][column];
        int k=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                maze[i][j] = string[k];
                k++;
            }
        }
        
        setVisited(row, column);
        
        if(Reachable()){
            printPath();
        }else{
            System.out.println("Oh no!!! Harry couldn't find the Triwizard Cup!");
            System.out.println("Someone quickly gets Professor Dumbledore.");
        }
        
    }
    
    public static void setVisited(int row, int column){
        visited = new boolean[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                visited[i][j]=true;
            }
        }
    }
    
    public static boolean Reachable(){
        int i = 0, j = 0;  
        int dir;
        Q3Node temp = new Q3Node(i,j);
        visited[0][0] = false;
        s.push(temp);
        
        while(!s.isEmpty()){
            
            temp = s.pop();
            i = temp.getX();
            j = temp.getY();
            dir = temp.getDir();
            
            temp.setDir(temp.getDir()+1);
            s.push(temp);
            
            switch (dir) {
                case 0:     //up
                    if(i-1>=0 && visited[i-1][j] && maze[i-1][j].equals("1")){
                        Q3Node newPath = new Q3Node(i-1, j);
                        visited[i-1][j] = false;
                        s.push(newPath);
                    }else if(i-1>=0 && visited[i-1][j] && maze[i-1][j].equals("C")){
                        Q3Node newPath = new Q3Node(i-1, j);
                        s.push(newPath);
                        return true;
                    }
                    break;
                case 1:     //right
                    if(j+1>=0 && visited[i][j+1] && maze[i][j+1].equals("1")){
                        Q3Node newPath = new Q3Node(i, j+1);
                        visited[i][j+1] = false;
                        s.push(newPath);
                    }else if(j+1>=0 && visited[i][j+1] && maze[i][j+1].equals("C")){
                        Q3Node newPath = new Q3Node(i, j+1);
                        s.push(newPath);
                        return true;
                    }
                    break;
                case 2:     //down
                    if(i+1>=0 && visited[i+1][j] && maze[i+1][j].equals("1")){
                        Q3Node newPath = new Q3Node(i+1, j);
                        visited[i+1][j] = false;
                        s.push(newPath);
                    }else if(i+1>=0 && visited[i+1][j] && maze[i+1][j].equals("C")){
                        Q3Node newPath = new Q3Node(i+1, j);
                        s.push(newPath);
                        return true;
                    }
                    break;
                case 3:     //left
                    if(j-1>=0 && visited[i][j-1] && maze[i][j-1].equals("1")){
                        Q3Node newPath = new Q3Node(i, j-1);
                        visited[i][j-1] = false;
                        s.push(newPath);
                    }else if(j-1>=0 && visited[i][j-1] && maze[i][j-1].equals("C")){
                        Q3Node newPath = new Q3Node(i, j-1);
                        s.push(newPath);
                        return true;
                    }
                    break;
                default:
                    visited[i][j] = true;
                    s.pop();
                    break;
            }
        }
        return false;
    }
    
    public static void printPath(){
        System.out.printf("\nHurray!!! Harry found the Triwizard Cup at (%d,%d)\n", s.peek().getX(), s.peek().getY());
        ArrayList<Q3Node> list = new ArrayList<>();
        while(!s.isEmpty()){
            list.add(s.pop());
        }
        System.out.println("This is the path Harry has taken: ");
        for(int i=list.size()-1; i>=0; i--){
            System.out.printf("(%d,%d)", list.get(i).getX(), list.get(i).getY());
            if(i!=0){
                System.out.print(" >> ");
            }
        }
        System.out.println("");
    }
    
}
