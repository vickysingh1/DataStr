/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexapmle;

import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class recursionfinocii {
    static int fib(int data)
    {
       
        if(data<=1)
            return data;
      
        return fib(data-1)+fib(data-2);
        
        
    }
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(fib(n));
        
        
    }
    
}
