
package P1;

/*
 * @author Aditya
 */

class A11 {
    
    A11() {
        this(10); //calls the constructor with one argument
        System.out.println("constructor with no arguments"); //second output
        displaying();
    } 
    
    void displaying() {
        System.out.println("printing..."); //third output
    }
    
    A11(int x) {
        System.out.println("contructor with one argument"); //first output
    }
    
    
  
    public static void main(String[] args) {
        A11 a = new A11(); // calls the constructor with no argument
        
    }
}
