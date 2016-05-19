
package P1;

class A {
    
    int nos = 25;
    
    void m1() {
        System.out.println("A");
    }
    public int addNos(int x, int y) {
        return x+y;
    }
    
    public int nos1() {
        return nos;
    }
}


class App {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        int ans = a.addNos(3, 4);
        System.out.println(ans);
        int n1 = a.nos1();
        System.out.println(n1);
        
    }
}   



/*
Output: 
A
7
25
*/
