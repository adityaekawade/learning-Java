
package p1;
import java.io.*;
import java.io.IOException;



public class CreateFileAndDir {
    public static void main(String[] args) {
       try {
  
        File myDir = new File("c:/mydir");
        myDir.mkdir();
        
        File myFile = new File(myDir, "myFile.txt");
        myFile.createNewFile();
        
       }
       catch (IOException e) {
           
       }
       
    }
}

