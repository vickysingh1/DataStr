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
public class SelectionSort {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        int min=0;
       for(int i=0;i<n-1;i++)
       {
          min=i;
          for(int j=i+1;j<n;j++)
          {
              if(arr[j]<arr[min])
              {
                  min=j;
              }
          }
          if(min!=i)
          {
             int temp=arr[i];
             arr[i]=arr[min];
             arr[min]=temp;
             
             
                      
          }
       }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    
    
}
