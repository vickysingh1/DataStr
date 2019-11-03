/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexapmle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Vicky
 */
public class dublicatesstringcount {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        List<String> list=new ArrayList<>();
       Set<String> li=new HashSet<>();
        String[] arr=kb.nextLine().split(" "); 
           for(String str:arr) 
                 list.add(str);
         li.addAll(list);
        for(String str:li)
          System.out.println(Collections.frequency(list,str)+" == "+str);

       
         
        



    }
    
}
