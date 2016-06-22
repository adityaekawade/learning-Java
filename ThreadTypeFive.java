//Overriding run() anonymously using Runnable interface 

abstract class A implements Runnable{
   
    public static void main(String[] args) {
        
        Runnable r = new Runnable () {
          @Override
          public void run() {
              System.out.println("Name of Thread : " + Thread.currentThread().getName());
          }  
        };
       
        Thread t1 = new Thread(r, "T1"); 
        t1.start(); 
    }
}


/*


Output: 

Name of Thread : T1

*/
