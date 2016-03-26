package P1;

//Example for Garbage collection

class A {
    int x;
    
    public static void main(String[] args) {
        A a = new A();
        
        A a1 = new A();
        
        a.x = 10;
        
        A a2 = m1(a);
        
        System.out.println(a2.x);
    }
    
    static A m1(A a) { //static keyword is used because, there is no need to create object of static method.
        a.x = 15;
        
        return a;
    }
}

/*
Output: 
15
*/
