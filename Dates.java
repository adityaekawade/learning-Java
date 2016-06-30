package p1;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

/**
 *
 * @author Ekawade
 */


 class A {
    public static void main(String[] args) throws ParseException {
        Date date = new Date(); 
        System.out.println("Date in TimeStamp format : " + date);
        
        
        DateFormat df = DateFormat.getDateInstance(); 
        String s = df.format(date); 
        System.out.println("Default format of DateFormat : " + s);
        
        
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);  
        String s1 = df1.format(date); 
        System.out.println("Short format of DateFormat : " + s1);
        
        Locale locIn = new Locale("hi", "in"); // hi --> Hindi,  in -->India 
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locIn);
        String s2 = df2.format(date); 
        System.out.println("Dateformat of IST in hindi : " +  s2);
        
        Date d1 = df1.parse(s1); 
        System.out.println("Returning date from a string : " + s1);
        
    }
}




/*
output: 
Date in TimeStamp format : Thu Jun 30 15:33:56 IST 2016
Default format of DateFormat : 30 Jun, 2016
Short format of DateFormat : 30/6/16
Dateformat of IST in hindi : गुरुवार, ३० जून, २०१६
Returning date from a string : 30/6/16

*/
