
//Passing self objects to Array List 

class X {}

class Y extends X{}

class Z extends Y {} 

class Array_listOne { 
    public static void main(String[] args) {
        ArrayList<X> list = new ArrayList<X>();
        list.add(new X()); 
        list.add(new Y()); 
        list.add(new Z()); 
        
        System.out.println(list);
        
        for(X x : list) {
            System.out.println(x);
           
        }
        
        for(X x : list) {
            Y y = (Y) x ; 
        }
        

    }
}

/*
Output: 

run:
[p1.X@4145f572, p1.Y@57f530d8, p1.Z@2259e205]
p1.X@4145f572
Exception in thread "main" java.lang.ClassCastException: p1.X cannot be cast to p1.Y
p1.Y@57f530d8
p1.Z@2259e205
*/
