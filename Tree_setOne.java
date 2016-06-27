class Tree_setOne { 
    public static void main(String[] args) {
        TreeSet set = new TreeSet();  //TreeSet returns object
        set.add(1); 
        set.add(12); 
        set.add(6); 
        set.add(3);
        set.add(5); 
        
        System.out.println(set);
        
        for(Object o : set) {  //o iterated through set. saving in Object o as the behaviour is object because of declaration 
            System.out.println(o);
            
        }
        
        System.out.println(" ");
        
        for(Object o : set) { 
            
            //Now we want to save the values in set in an int 
            // if we just write int i = o;, we get object cannot be converted to int. so we need to cast it. 
            //cast using Integer and not int
            
            int i = (Integer) o;
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
 
1
3
5
6
12
*/
