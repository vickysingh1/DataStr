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
public class MergeSort{
    public void mergeSort(int arr[],int lb,int ub)
    {
        int mid=0;
        if(lb<ub)
        {
            mid=(lb+ub)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            mergingSort(arr,lb,mid,ub);
            
            
        }
    }
    public void mergingSort(int arr[],int lb,int mid,int ub)
    {
        int i=lb;
        int j=mid+1;
        int k=lb;
            int brr[]=new int[arr.length];
        while(i<=mid && j<=ub)
        {
            if(arr[i]<=arr[j])
            {
               brr[k]=arr[i];
               i++;
               k++;
            }else{
                brr[k]=arr[j];
                j++;
                k++;
            }
        }
        if(i>mid){
            while(j<=ub){
                brr[k]=arr[j];
                j++;
                k++;
            }
        }else{
            while(i<=mid){
                brr[k]=arr[i];
                i++;
                k++;
            }
        }
        for(k=lb;k<=ub;k++)
        {
            arr[k]=brr[k];
        }
        
        
       
    }
   
    
  static void show(int arr[])
  {
      for(int m:arr)
      {
          System.out.print(m+" ");
      }
  }
    


    public static void main(String[] args) {
  
         Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[n];
    
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        int lb=0;
        int ub=arr.length-1;
      
        
      MergeSort obj=new MergeSort();
       obj.mergeSort(arr, lb, ub);
       
        show(arr);
        
    
        
        
    
    
}
}