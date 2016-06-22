
//Using object of class Thread
class A extends Thread { 
    
    public void run() {
        System.out.println("Name of Thread : " + Thread.currentThread().getName()); 
        
    }
    
    public static void main(String[] args) {
       Thread t1 = new Thread(new A(), "T1"); 
       t1.start(); 
       
       Thread t2 = new Thread(new A(), "T2"); 
       t2.start();
       
    }
}


/*
Output: 

Name of Thread : T1
Name of Thread : T2
*/
