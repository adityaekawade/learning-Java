
package p1;

import java.util.*;

/**
 *
 * @author Ekawade
 */


class HashMapIterator { 
    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<>(); 
        
        map.put(1, "abc"); 
        map.put(2, "pqr"); 
        map.put(3, "xyz");
        
        Iterator <Map.Entry<Integer,String>> itr =  map.entrySet().iterator(); 
        
        while(itr.hasNext()) { 
            Map.Entry<Integer,String> e =   itr.next(); 
            
            System.out.println(e.getKey() + " = " + e.getValue() );
        }
    }
}


/*
output: 
1 = abc
2 = pqr
3 = xyz

*/
