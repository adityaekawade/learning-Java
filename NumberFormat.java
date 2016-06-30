package p1;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

/**
 *
 * @author Ekawade
 */



 class A {
    public static void main(String[] args) throws ParseException {
        double d = 3.6; 
        float f = 42.54F; 
        NumberFormat nf = NumberFormat.getCurrencyInstance(); 
        String s = nf.format(d); 
        System.out.println(s);
        
        String s1 = nf.format(f); 
        System.out.println(s1);
        
        
        double d1 = (double) nf.parse(s); 
        System.out.println(d1);
        
        double f1 = (double) nf.parse(s1); 
        System.out.println(f1);
    }
}




/*
output: 
Rs.3.60
Rs.42.54
3.6
42.54

*/
