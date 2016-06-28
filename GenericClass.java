
package p1;

import java.util.*;

/**
 *
 * @author Ekawade
 */



public class A {
    public static void main(String[] args) {
        Customer<Integer> c = new Customer<Integer>(); 
        Customer<String> c1 = new Customer<String> (); 
        
        
        c.add(23);
        c1.add("hello");
        System.out.println(c.getOutput());
        System.out.println(c1.getOutput());
         
        
    }
}


class Customer <E> { 
    
    E e;
    
    public void add(E e) {
        this.e = e;
        System.out.println(e);
    }
    
    E getOutput() {
        return e; 
    }
}



/*
output: 
23
hello
23
hello

*/
