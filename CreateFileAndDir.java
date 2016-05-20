
package p1;
import java.io.*;
import java.io.IOException;



public class CreateFileAndDir {
    public static void main(String[] args) {
       try {
        
        //Creates a directory
        File myDir = new File("c:/mydir");
        myDir.mkdir();
        
        //Creates a files inside the directory
        File myFile = new File(myDir, "myFile.txt");
        myFile.createNewFile();
        
        // Insert text inside the file created 
        try (PrintWriter pw = new PrintWriter(myFile)) {
               pw.println("Hey World");
               pw.flush();
           }
        
       }
       catch (IOException e) {
           
       }
       
    }
}

