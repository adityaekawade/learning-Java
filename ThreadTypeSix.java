// Complete Anonymous overriding of run() and starting of Thread. 

abstract class A implements Runnable{
   
    public static void main(String[] args) {
        
        new Thread ( new Runnable() { 
            @Override
            public void run() {
                System.out.println("Name of Thread : " + Thread.currentThread().getName());
            }
        }, "T1" ) .start();
    }
}


/*


Output: 

Name of Thread : T1

*/
