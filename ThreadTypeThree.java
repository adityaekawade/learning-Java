//Starting a Thread anonymously using Thread class 
class A extends Thread { 

    public static void main(String[] args) {
       
        Thread t1 = new Thread() {
          @Override
          public void run() {
              System.out.println( "Name of Thread : " + Thread.currentThread().getName());
          }  
        };
        t1.start();
        
        Thread t2 = new Thread("T2") {
          @Override
          public void run() {
              System.out.println( "Name of Thread : " + Thread.currentThread().getName());
          }  
        };
        t2.start();
        
        Thread t3 = new Thread("T3") {
          @Override
          public void run() {
              System.out.println( "Name of Thread : " + Thread.currentThread().getName());
          }  
        };
        t3.start();
        
        Thread t4 = new Thread("T4") {
          @Override
          public void run() {
              System.out.println( "Name of Thread : " + Thread.currentThread().getName());
          }  
        };
        t4.run();
       
    }
}


/*
Output: 

Name of Thread : Thread-0
Name of Thread : T2
Name of Thread : T3
Name of Thread : main
*/
