/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexapmle;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class Stringconta {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        double b=scan.nextDouble();
      Scanner kb=new Scanner(System.in);
      String cs=kb.nextLine();
        System.out.println(i+a);
        System.out.println(d+b);
        
        System.out.print(s);
        System.out.print(cs);
           scan.close();
    
    }
}
 

