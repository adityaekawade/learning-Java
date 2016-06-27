
package p1;

import java.util.*;

/**
 *
 * @author Ekawade
 */


class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>(); 
        
        map.put(1, "abc"); 
        map.put(2, "pqr"); 
        map.put(3, "xyz"); 
        
        System.out.println("All keys"); 
        for(int i : map.keySet()){
            System.out.println(i);
        }
        
        System.out.println("All Values");
        for(String s : map.values()) {
            System.out.println(s);
        }
        
        System.out.println(" ");
        System.out.println("Key value pair");
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e);
        }
        
        System.out.println(" ");
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey() + " = " + e.getValue() );
        }
        
    }
} 


/*
Output: 

All keys
1
2
3
All Values
abc
pqr
xyz
 
Key value pair
1=abc
2=pqr
3=xyz
 
1 = abc
2 = pqr
3 = xyz

*/ 
