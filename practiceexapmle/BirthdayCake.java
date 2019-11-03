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
public class BirthdayCake{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        int d=kb.nextInt();
        int m=kb.nextInt();
        int a=0;
        int count=0;
  
        int sum=0;
       
           for(int i=0;i<=arr.length-m;i++)
           {
               for(int j=i;j<i+m;j++)
               {
                   sum=sum+arr[j];
                   
                   
               }
               if(sum==d)
               {
                   
                   count++;
                   
               }
               sum=0;
           }
           
      
        System.out.println(count);
        }
        
      
        
    }
    

