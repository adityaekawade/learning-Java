
package p1;
import java.io.File;
import java.io.FileReader;


public class TryAndCatch {
    public static void main(String[] args) {
        try {
            File f = new File("D://file.txt");
            FileReader fr = new FileReader(f);
        }
        
        catch (Exception e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block is still executed");
        }
    }
}



/*
Output: 

File not found
E:\file.txt (The system cannot find the file specified)
java.io.FileNotFoundException: E:\file.txt (The system cannot find the file specified)
finally block is still executed
	at java.io.FileInputStream.open(Native Method)
	at java.io.FileInputStream.<init>(FileInputStream.java:138)
	at java.io.FileReader.<init>(FileReader.java:72)
	at p1.TryAndCatch.main(TryAndCatch.java:11)

*/
