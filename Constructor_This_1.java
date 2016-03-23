
package P1;

/*
 * @author Aditya
 */

class A11 {
    
    A11() {
        this(10); 
        System.out.println("constructor with no arguments"); // this statement is not called
        displaying();
    } 
    
    void displaying() {
        System.out.println("printing..."); //second output
    }
    
    A11(int x) {
        System.out.println("contructor with one argument"); //first output
    }
    
    
  
    public static void main(String[] args) {
        A11 a = new A11(50); // calls the constructor with one argument
        a.displaying(); // calls the method displaying
        
    }
}
