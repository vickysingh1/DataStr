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
public class BreakTheRecord {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=kb.nextLong();
        }
        int i=1,count=0,count1=0;
        long a=arr[0];
      
        while(i<arr.length)
        {
            if(a<arr[i])
            {
                count++;
                a=arr[i];
                i++;
            }
            else
            {
                i+=1;
            }
        }
        i=1;
        long b=arr[0];
       
        while(i<arr.length)
        {
            if(b>arr[i])
            {
                count1++;
                b=arr[i];
                i++;
            }
            else
            {
                i++;
            }
        }
        System.out.print(count+" ");
        System.out.print(count1);
                
    }
    
}
