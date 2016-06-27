class Array_list { 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        list.add(3); 
        list.add(5);
        list.add(2); 
        
        System.out.println(list);
        System.out.println("Before Sorting");
        for(int x : list) {
            System.out.println(x);
        }
        
        Collections.sort(list); 
        System.out.println("After Sorting");
        
        for(int y : list) {
            System.out.println(y);
        }
        
    }
}

/*
Output: 

[3, 5, 2]
Before Sorting
3
5
2
After Sorting
2
3
5

*/
