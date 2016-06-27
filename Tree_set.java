

class Tree_set { 
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();  //Changing behaviour to Integer
        set.add(1); 
        set.add(12); 
        set.add(6); 
        set.add(3);
        set.add(5); 
        
        System.out.println(set);
        
        for(int i : set) {  //i iterated through set whose behaviour is integer, done through <Integer> 
            System.out.println(i);
        }

    }
}

/*
Output: 
[1, 3, 5, 6, 12]
1
3
5
6
12
*/
