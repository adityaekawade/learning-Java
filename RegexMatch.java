
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ekawade
 */



class A {
    public static void main(String[] args) throws ParseException {
       String s = "TestA. TestB"; 
       String [] s1 = s.split("\\.\\s"); 
       for (String a : s1) {
           System.out.println(a);
       }
       
       System.out.println(" ");
       
       String str = "10 Apples 20 Mangoes"; 
       Scanner sc = new Scanner(str).useDelimiter("\\d+\\s");
       while(sc.hasNext()) {
           System.out.println(sc.next()); 
       }
       
        System.out.println(" ");
        
        
        
        Pattern p = Pattern.compile("Mangoes"); 
        Matcher m = p.matcher(str);
        System.out.println(m.find());
        
    }
}




/*
output: 
TestA
TestB
 
Apples 
Mangoes
 
true
*/
