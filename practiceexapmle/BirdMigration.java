/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexapmle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class BirdMigration {
    public static void main(String[] args) {
         Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        int a=arr[0];
        int count=0,bcount=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i;j<arr.length-1;j++)
            {
               if(arr[i]==arr[j])
               {
                   System.out.println(arr[i]+"="+arr[j]);
               }
            }
       
        }
        System.out.println("counter"+count);
       }
    
}
