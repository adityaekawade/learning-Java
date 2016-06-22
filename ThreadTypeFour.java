//Overriding run() using Runnable Interface and executing in new Thread 

class A implements Runnable{
    
    public void run() {
        System.out.println("Thread Name of object t1 is : " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        
       Thread t1 = new Thread (new A(), "T1"); 
       t1.start(); 
       
       Thread t2;
        t2 = new Thread (new A(), "T2") {
            public void run() {
                System.out.println("Thread Name of object t2 is : " + Thread.currentThread().getName());
            }
        };
        t2.start();
        
        Thread t3 = new Thread ("T3") {
            public void run() {
                System.out.println("Thread Name of object t3 is : " + Thread.currentThread().getName());
            }
        };
        t3.start();
    }
}


/*

Output: 

Thread Name of object t2 is : T2
Thread Name of object t1 is : T1
Thread Name of object t3 is : T3

*/
