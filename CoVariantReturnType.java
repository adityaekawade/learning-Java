package P1;

public class A {
    int x = 10; 
    void display() {
        System.out.println("A");
    }
    A m1() {
        return new A();
    }
}

class B extends A {
    int x = 20; 
    void display() {
        System.out.println("B");
    }
    
    A m1() {     //Even if the method is B m1(), it will be same as A m1(), because there is "IS-A" relation between Class A & B, since A is extended by B. 
        return new B();
    }
    
    public static void main(String[] args) {
        A a = new B(); // creates polymorphic object
        System.out.println(a.m1().x); //10 [a.m1() - poly, then follow the reference]
        a.display(); //B [polymorphic method call]
        a.m1().display(); //B  [a.m1() - poly, m1() method is overrided and subclass is executed
    }
}
