
package p1;
import java.io.*;



public class TryAndCatch {
    public static void main(String[] args) {
       try {
       
           File checkDir = new File("c:/mydir");
           System.out.println(checkDir.isDirectory());
           
           File checkFile = new File(checkDir, "myFile.txt");
           System.out.println(checkFile.isFile());
           
           FileReader fr = new FileReader(checkFile); 
           BufferedReader br = new BufferedReader(fr); 
           
           String s; 
           
           while ( (s = br.readLine()) != null ) {
               System.out.println(s);
               br.close();
           }
           
       }
       catch (Exception e) {
           
       }
       
    }
}



/*

Output: 

true
true
Hey World

*/
