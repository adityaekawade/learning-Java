class A extends Thread {
    
    public void run() {
        synchronized(" ") {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException ex) {               
            }
            
        }
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

With sync: 
T1
T1
T2
T2

without sync: 
T1
T2
T2
T1

*/
