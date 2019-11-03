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
public class appleorange {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int disapple=kb.nextInt();
        int disorange=kb.nextInt();
        int a=kb.nextInt();
        int b=kb.nextInt();
        int m=kb.nextInt();
        int n=kb.nextInt();
        int arr[]=new int[m];
        int arr1[]=new int[n];
        
        for(int i=0;i<m;i++)
        {
            arr[i]=kb.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr1[i]=kb.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(a)+(arr[i]);
        }
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=(b)+(arr1[i]);
        }
//         for(int i=0;i<m;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//         System.out.println();
//          for(int i=0;i<n;i++)
//        {
//            System.out.print(arr1[i]+" ");
//        }
          
         int count=0;
         int count1=0;
        for(int i=0;i<m;i++)
        {
            if(disapple<=arr[i] && arr[i]<=disorange)
            {
                count++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(disapple<=arr1[i] && arr1[i]<=disorange)
            {
                count1++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
