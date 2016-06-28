class GenericMethod { 
    public static void main(String[] args) {
        Integer[] i = new Integer[] { 1, 2, 3}; 
        Float[] f = new Float[] { 1F, 2F, 3F}; 
        int [] i1 = new int[] {1, 2, 3}; 
        
        display(); 
        display(5);
        display(i);
        display(f);
        
    }
    
    static void display() {
        System.out.println("hey world");
    }
    
    static void display(int i) {
        System.out.println("Hello");
    }
    
    static <T> void display(T[] i) { // Argument (T[] i) ==> (int i)
        for(T il : i) {  //while looping for(T il : i) ==> for(int il : i)
            System.out.println(il);
        }
    }
    
}


/*
output: 
hey world
Hello
1
2
3
1.0
2.0
3.0

*/
