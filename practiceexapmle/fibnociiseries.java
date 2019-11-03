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
      
public class fibnociiseries {
    public static void main(String[] args) {
        
      Scanner kb=new Scanner(System.in);
      int n=kb.nextInt();
      int a=1,b=1;
      int c;
        System.out.println(a+"\n"+b);
      for(int i=2;i<=n;i++)
      {
          c=a+b;
          a=b;
          b=c;
          System.out.println(b+" ");    
      
      }
        
    }
    
}