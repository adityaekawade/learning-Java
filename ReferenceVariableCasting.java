package P1;

public class A {
    int x = 35;
    void m1() {
        System.out.println("A");
    }
}

class B extends A {
    int x = 20;
    void m1(){
        System.out.println("B");
    }
}

class App {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        a = b; //creating plymorphic object   (Implicit casting)
        a.m1();
        
        b = (B)a;    // Explicit casting, Avoids CF and because implicit casting is used program runs instead of throwing exception    
        b.m1();
        
        System.out.println(b.x);
        System.out.println(a.x);
        
    }
}

//OUTPUT: 
B
B
20
35
