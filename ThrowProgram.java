/*
 It is possible for the program to throw an exception explicitly, using the "throw" statement. 
 The general form of throw statement is: throw ThrowableInstance;
 There are 2 ways to obtain a throwable object: using a parameter into a catch clause or creating one with the new operator. 
*/


package p1;


public class ThrowProgram {
    public static void main(String[] args) {
        try {
           throw new NullPointerException("demo"); //Throwable object created with the new operator
        }
        
        catch (NullPointerException e) {
            System.out.println("Caught inside the method");
            e.printStackTrace();
            throw e; //rethrow the exception
            
        }
       
    }
}



/*
Output: 
Caught inside the method
java.lang.NullPointerException: demo
	at p1.TryAndCatch.main(TryAndCatch.java:8)
Exception in thread "main" java.lang.NullPointerException: demo
	at p1.TryAndCatch.main(TryAndCatch.java:8)
*/
