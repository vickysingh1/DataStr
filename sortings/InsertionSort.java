/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortings;

import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class InsertionSort {
    public static void main(String[] args) {
   Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        
        for(int i=1;i<n;i++)
        {
            
            
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
              
             
            arr[j+1]=temp;
            
                  
            }
        }
        
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
    
}
