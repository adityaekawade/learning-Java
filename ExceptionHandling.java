
package exception.handling;

import java.io.*;


public class ExceptionHandling {
    
    void m1() throws IOException { 
        
        try {
            throw new IOException();
        }
        
        catch (IOException e) {
            System.out.println("Exception handled");
        }
        
        catch(Exception e) {
            System.out.println("HIgher level of exception");
        }
        
        finally {
            System.out.println("this is going to be printed");
        }
    }
    
    

    public static void main(String[] args) throws Exception {
        new ExceptionHandling().m1();
    }
    
}



/*

Output: 

run:
Exception handled
this is going to be printed

*/
