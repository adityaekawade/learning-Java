
package p1;

public class TryAndCatch {
    public static void main(String[] args) {
        try {
            int dividebyzero = 5/0;
        }
        catch (ArithmeticException e ){
            System.out.println("You are dividing by zero");
            e.printStackTrace(); //helps to trace the exception
        }
        catch (Exception e) {
            System.out.println("Some other exception");
        }
    }
}


/*
Output: 
You are dividing by zero
java.lang.ArithmeticException: / by zero
	at p1.TryAndCatch.main(TryAndCatch.java:7)
*/
