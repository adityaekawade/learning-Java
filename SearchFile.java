package p1;
import java.io.*;



public class SearchFile {
    public static void main(String[] args) {
       try {
           
           String[] files = new String[100]; 
           File search = new File("c:/mydir"); 
           files = search.list(); //File.list() method to create a String array of files and directories
           
           for(String fn : files)
               System.out.println("found " +fn);
           
           
       }
       catch (Exception e) {
           
       }
       
    }
}

/*

Output: 
found myFile.txt

*/
