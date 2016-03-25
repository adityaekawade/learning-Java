
package P1;

/*
 * @author adityaekawade
 */

class A11 {
    A11(int x){
        this();
        display();
    }
    
    void display() {
        System.out.println("A");
    }
    
    A11() {
        displayAndPrint();
    }
    
    void displayAndPrint() {
        System.out.println("A11");
    }
    
    
}

class B11 extends A11 {
    B11(){
        super(10);
        display();
    }    
    @Override
    void display() {
        System.out.println("B");
    }
}

class C11 extends B11{
    C11() {
        super();
        displaying();
    }
    static void displaying(){
        System.out.println("C");
    }
}

class D11 extends C11 {
    D11() {
        displaying();
    }
    
    static void displaying() {
        System.out.println("D");
    }
}

class App {
    public static void main(String[] args) {
        D11 d = new D11(); //Creates object of class D11
    }
}


/*
*
Output: 
A11
B
B
C
D
*
*/
