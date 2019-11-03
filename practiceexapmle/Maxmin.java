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
public class Maxmin {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        ArrayList list=new ArrayList<>();
        int n=kb.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(kb.nextInt());
        }
        Collections.sort(list);
        for(Object i:list)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n"+list.get(n-2));
        
    }
    
}
