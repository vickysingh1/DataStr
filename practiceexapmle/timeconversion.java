/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexapmle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class timeconversion {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        SimpleDateFormat df=new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat odf=new SimpleDateFormat("HH:mm:ss");
        
        Date date=null;
        String output=null;
        try{
            date=df.parse(str);
            output=odf.format(date);
            System.out.println(output);
        }
        catch(Exception exz)
        {
            exz.printStackTrace();
        }
        
    }
    
}
