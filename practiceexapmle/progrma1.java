/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexapmle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Vicky
 */
public class progrma1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
       int n=kb.nextInt();
      
       List list1=new ArrayList<>();
       int count=0;
       for(int i=0;i<n;i++){
            String[] items = kb.next().split("#");
      List<String> itemList = new ArrayList<String>(Arrays.asList(items));
           System.out.println(itemList);
            list1.add(Collections.frequency(itemList, "o"));
            
            
            }
            Set<Integer> st = new HashSet<Integer>(list1); 
             st.remove(Collections.max(st));
            System.out.println(Collections.max(st)+"");
    } 
       
       
       
    }
    

