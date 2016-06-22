class A extends Thread { 
     @Override
     public void run() {
        System.out.println("A");
        System.out.println("Name of the thread : " + Thread.currentThread().getName());
    }
     
    A (String name) {
        super(name); 
    } 
    
    public static void main(String[] args) {
        A a = new A("T1"); 
        a.start();
    }
}


/*
Output: 

A
Name of the thread : T1

*/
