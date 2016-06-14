package exception.handling;

import java.io.*;


public class CheckedException {
    
    void m1() throws IOException { //Warning for checked excption which is mandatory 
        throw new IOException (); //Checked Exception so need of warning 
    }


    public static void main(String[] args) throws IOException { //Warning mandatory. same or higher level of hierarchy  
        new CheckedException().m1();
    }
    
}
