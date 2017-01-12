/*
Question: Hash Tables: Ransom Note: https://www.hackerrank.com/challenges/ctci-ransom-note

*/

/*

Logic: 
Words from both Magazine and Note are stored in a hasmap. Then words in notemap are compared with words in magazineMap. 
*/




import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>(); //Creates HashMap
        
        noteMap = new HashMap<String, Integer>(); //Creates HashMap
        
        for(String m_word : magazine.split(" ")) {  //Loops through each word in the string from input (this string is split through .split())
            Integer i = magazineMap.get(m_word); 
            //System.out.println(i); --> will print as null, null since there is no key for m_word. get() is the inverse of put. 
            //Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
            
            
            if(i==null) {
                magazineMap.put(m_word, 1); //this condition is executed. So the value for all words is 1 which is an integer. 
            }
            else {
                magazineMap.put(m_word, i+1); 
            }
            
            //In this key is the word (String) and value is the number(Integer), since it is specified this way in the definition of HashMap
        }
        
        
        for(String n_word : note.split(" ")) { //Loops through each word in the string from input (this string is split through .split())
            Integer i = noteMap.get(n_word); 
            
            if(i==null) {
                noteMap.put(n_word, 1);
            }
            else {
                noteMap.put(n_word, i+1); 
            }
        }        
        
    }
   
    public boolean solve() {
        for(Map.Entry<String, Integer> e :noteMap.entrySet()) {
            //int i = e.getKey();
            //System.out.println(i);
            Integer i = magazineMap.get(e.getKey()); //gets the key for the keys. e.getKey() would give the words which are the keys in this hashmap and .get() would get the keys which as seen above is 1 for all the values.
            //Used for comparing notemap with magazineMap
            if(i==null) {
                return false;
            }
            else {
                if(e.getValue()>i) { 
                    return false;
                }
            }
        }
        return true; //always specify the true or false depending on the output we want. 
        
    }
 
 /*  
    public void solve() {
        for(Map.Entry<String, Integer> e :noteMap.entrySet()) {
            String i = e.getKey();
            Integer y = magazineMap.get(e.getKey());
            System.out.println(i);
            System.out.println();
            System.out.println(e.getValue());
            System.out.println();
            System.out.println("y : " + y);
            System.out.println();
        }
    }
    
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        s.solve();
        
      
        boolean answer = s.solve();
        
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
