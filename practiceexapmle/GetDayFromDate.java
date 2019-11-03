/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexapmle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author vicky
 */
public class GetDayFromDate {
     public static void main(String[] args) {

      Date d1 = new Date(2004 , 2-1 ,29); 
         System.out.println(d1);
        
         

        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week abbreviated
        System.out.println(simpleDateformat.format(d1));
        
    
}}
