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


  
class MaxRepeating { 
  
    // Returns maximum repeating element in arr[0..n-1]. 
    // The array elements are in range from 0 to k-1 
    static int maxRepeating(int arr[], int n, int k) 
    { 
        // Iterate though input array, for every element 
        // arr[i], increment arr[arr[i]%k] by k 
        for (int i = 0; i< n; i++) 
            arr[(arr[i]%k)] += k; 
       
        // Find index of the maximum repeating element 
        int max = arr[0], result = 0; 
      
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] > max) 
            { 
               max=arr[i];
               result=i;
            }
         //   System.out.println(arr[i]);
            
            
        } 
  
       
        return result; 
    } 
  
    /*Driver function to check for above function*/
    public static void main (String[] args) 
    { 
  
//        int arr[] = {2, 4, 4, 5, 3, 4, 1, 7, 3, 3, 4, 7, 4, 4, 3}; 
//        int n = arr.length; 
//        int k=arr.length; 
//        System.out.println("Maximum repeating element is: " + 
//                           maxRepeating(arr,n,k)); 
        Scanner kb=new Scanner(System.in);
       int n=kb.nextInt();
        
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=kb.nextInt();
           
       }
       int k=arr.length;
        System.out.println(maxRepeating(arr,n,k));
    } 
}
    

