class A  {
    
    int count = 0; 
    
    synchronized void incrementFunction () {
        count++; 
    }
    
    void m1() throws InterruptedException {
        
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++) {
                    incrementFunction(); 
                }
                
            }
        }; 
        
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++) {
                    incrementFunction(); 
                }
            }
        }; 
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join(); 
        System.out.println(count);
        
    }
    
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.m1();
    }
}

/*
Output: 

Count is : 20000
*/
