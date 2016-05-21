
package p1;


public class PrecisionAndCasting {
    public static void main(String[] args) {
       int x = (int) 5.0f; //casting 
        System.out.println(x);
        
        byte b = (byte) 150; //Casting 
        System.out.println(b);
        
        double d = 3.6;
        int z = 5;
        d = x; //Gaining precision 
        System.out.println(d);
        
        long y = 5; //Widening - increasing container size 
        System.out.println(y);
        
        float f = 5;  //Widening - Gaining precision
        System.out.println(f);
        
    }
}

/*
Output: 
5
-106
5.0
5
5.0
*/
