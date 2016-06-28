import java.util.*;

/**
 *
 * @author Ekawade
 */


class ArrayListComparableSorting implements Comparable<ArrayListComparableSorting> { 
   
    int amount; 
    String customername; 
    
    ArrayListComparableSorting(String customername, int amount) {
        this.customername = customername; 
        this.amount = amount; 
    }
    
    public String toString() {
        return this.customername + this.amount;
    }

    @Override
    public int compareTo(ArrayListComparableSorting o) {
        return this.amount - o.amount; 
    }
}

class App {
    public static void main(String[] args) {
        ArrayListComparableSorting c = new ArrayListComparableSorting("John", 50000);
        ArrayListComparableSorting c1 = new ArrayListComparableSorting("Pep", 20000);
        ArrayListComparableSorting c2 = new ArrayListComparableSorting("Jose", 9000);
        ArrayListComparableSorting c3 = new ArrayListComparableSorting("Rob", 12000);
        
        ArrayList<ArrayListComparableSorting> list = new ArrayList<ArrayListComparableSorting> (); 
        list.add(c);
        list.add(c1); 
        list.add(c2); 
        list.add(c3); 
        
        System.out.println(list);
        System.out.println(" ");
        
        Collections.sort(list); 
        
        System.out.println("After sorting");
        System.out.println(" ");
        
        for(ArrayListComparableSorting a : list) {
            System.out.println(a);
        }
        
    }
}

/*
output: 
[John50000, Pep20000, Jose9000, Rob12000]
 
After sorting
 
Jose9000
Rob12000
Pep20000
John50000

*/
