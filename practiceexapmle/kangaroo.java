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
class ram{
public void solve(){
    Scanner kb=new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++)
        {
            arr[i]=kb.nextInt();
           
        }
       
        for(int i=0;i<10000;i++)
        {
             if(arr[1]<=arr[3])
            {
                System.out.println("NO");
               return;
            }
            
            
             if(arr[0]==arr[2])
            {
                System.out.println("YES");
                return;
                
            }   
           
            arr[0]=arr[0]+arr[1];
            arr[2]=arr[2]+arr[3];
        }
 System.out.print("NO");

}
}
public class kangaroo {
    public static void main(String[] args) {
        
        ram a=new ram();
          a.solve();
        
    }
    
}
