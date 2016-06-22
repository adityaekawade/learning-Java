class A extends Thread {
    
    @Override
    public void run() {
        for (int i=1; i<4; i++) {
            System.out.print(i);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Start");
        
        Thread t1 = new Thread(new A());
        t1.start(); 
        t1.join(); //Delay main Thread till Thread t1 finished. 
        
        
        System.out.print("Complete");
        
        
    }
}



/*


Output: 

Start123Complete

*/
