/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIA2016S2;

import java.util.Stack;

/**
 *
 * @author Xin Jie
 */
public class Q2 {
    private Stack<Character> s = new Stack<>();
    
    public int BracMatch(String str){
        
        if(str.contains("[") || str.contains("{") || str.contains("(") || str.contains("<")){
            for(int i=0; i<str.length(); i++){
                switch(str.charAt(i)){
                    case '[':
                        s.push('[');
                        break;

                    case '{':
                        s.push('{');
                        break;

                    case '(':                    
                        s.push('(');
                        break;

                    case '<':
                        s.push('<');
                        break;

                    case ']':
                        if(!s.pop().equals('['))
                            return -1;
                        break;

                    case '}':
                        if(!s.pop().equals('{'))
                            return -1;
                        break;

                    case ')':
                        if(!s.pop().equals('('))
                            return -1;
                        break;

                    case '>':
                        if(!s.pop().equals('<'))
                            return -1;
                        break;

                    default: 
                        continue;
                }
            }
            if(s.empty())
                return 1;
        }
        
        return 0;
    }
    
}
