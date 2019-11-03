/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexapmle;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vicky
 */
public class p2 {
    public static void main(String[] args) {
        
//        int arr[]={50,10,30,40,20};
//       for(int i=0;i<arr.length-1;i++)
//       {
//           for(int j=0;j<arr.length-i-1;j++)
//           {
//               if(arr[j]>arr[j+1])
//               {
//                   int temp=arr[j];
//                   arr[j]=arr[j+1];
//                   arr[j+1]=temp;
//               }
//           }
//       }
//       for(int i=0;i<arr.length;++i)
//       {
//           System.out.println(arr[i]);
//       }
//        System.out.println();

       ArrayList<Integer> list=new ArrayList<>();
       list.add(50);
       list.add(10);
       list.add(30);
       list.add(40);
       list.add(20);
       Collections.sort(list, Collections.reverseOrder());
       for(int i:list)
       {
           System.out.println(i);
       }
       Collections.sort(list);
        System.out.println("----------------------------");
       for(int i:list)
       {
           System.out.println(i);
       }
              
    }
    
}
