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
public class p1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=kb.nextInt();
        
        int arr[]=new int[n];
        
       int count=0;
       
        for(int i=0;i<arr.length;i++)
        {
            int k=kb.nextInt();
            arr[i]=k;
            count++;
        }
        System.out.println("enter the number want to search");
        int en=kb.nextInt();
        for(int i=0;i<count;i++)
        {
            if(arr[i]==en)
            {
                System.out.println(i);
            }
        }
        
            
        
    }
    
}
