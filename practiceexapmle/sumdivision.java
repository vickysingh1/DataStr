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
public class sumdivision {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
       
        int sum=0,count=0;
        for(int i=0;i<=arr.length-1;i++)
        {
         
            for(int j=i;j<arr.length-1;j++)
            {
              
               
                
                sum=arr[i]+arr[j+1];
                System.out.print(sum+",");
                 if(sum%k==0)
           {
               count++;
           }
                
                
                
            }
         
         
            
            sum=0;
          
            
        }
        System.out.println("counter"+count);
    }
    
}
