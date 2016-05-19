
package p1;
import java.io.IOException;

public class Throwsprog {
    void m1() throws IOException {
        throw new IOException("demo");
    }
    
    void n1() throws IOException {
        m1();
    }
    
    void p1() {
        try {
            n1();
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}

class TestThrows {
    public static void main(String[] args) {
        Throwsprog t = new Throwsprog();
        t.p1();
       
    }
}



/*
Output: 
Exception handled
*/


/*
Explanation: 
Object (t) calls the method p1() , which invoke n1() from its try block. 
n1() calls the method m1(), but also throws an exception, giving a warning of an exception. 
m1() creates a throwable excpetion and the flow control is transferred to catch block, which is executed.  

*/
