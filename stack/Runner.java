/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;


import java.util.Scanner;



/**
 *
 * @author vicky
 */
public class Runner {
    public static void main(String[] args) {
     Scanner kb=new Scanner(System.in);   
        Stack stk=new Stack();
        
        
        
      
        stk.push(10);
         stk.push(20);
          System.out.println(stk.peek());
          stk.push(30);
             stk.push(40);
              stk.push(50);
         stk.push(60);
          stk.push(70);
         stk.push(80);
           stk.show();
           System.out.println("-------------");
          
           System.out.println(stk.pop());
            System.out.println("-------------");
           stk.show();
           System.out.println(stk.size());
          stk.isEmpty();
          System.out.println(stk.pop());
          System.out.println(stk.pop());
          System.out.println(stk.pop());
            stk.show();
           System.out.println(stk.size());
          
           
    }
    
}
