package p1;

import java.util.Arrays;

/**
 * Created by Aditya Ekawade on 1/5/2017.
 */
public class TheStack {

    private String[] stackArray; //defines a new array

    private int stackSize; //sets stack as empty

    private int topOfStack = -1;

    TheStack(int size) {
        stackSize = size;

        stackArray = new String[size];

        Arrays.fill(stackArray, "-1"); //put -1 in all indexes that don't have values
    }

    public void push(String input){
        System.out.println();
        System.out.println("topofstack value is : " + topOfStack);
        System.out.println();
        if(topOfStack + 1 < stackSize ) {
            topOfStack++;
            stackArray[topOfStack] = input;

        }
        else {
            System.out.println("the stack is full");
        }
        //displayTheStack();

        System.out.println("PUSH " + input + " was added\n" );

        System.out.println(Arrays.toString(stackArray));
    }

    public String pop() {
        if(topOfStack >= 0) {
            //displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " Was Removed From the Stack\n");
            System.out.println(Arrays.toString(stackArray));
            stackArray[topOfStack] = "-1"; //just puts the value at the last index to -1.
            return stackArray[topOfStack--]; //decrements the value of topofstack

        }
        else {
            // displayTheStack();

            System.out.println("Sorry But the Stack is Empty");

            return "-1";
        }
    }




    public static void main(String[] args) {
        TheStack thestack = new TheStack(10);
        thestack.push("10");
        thestack.push("14");
        thestack.push("20");
        thestack.push("80");

        thestack.pop();

    }
}



/*
Output: 


topofstack value is : -1

PUSH 10 was added

[10, -1, -1, -1, -1, -1, -1, -1, -1, -1]

topofstack value is : 0

PUSH 14 was added

[10, 14, -1, -1, -1, -1, -1, -1, -1, -1]

topofstack value is : 1

PUSH 20 was added

[10, 14, 20, -1, -1, -1, -1, -1, -1, -1]

topofstack value is : 2

PUSH 80 was added

[10, 14, 20, 80, -1, -1, -1, -1, -1, -1]
POP 80 Was Removed From the Stack

[10, 14, 20, 80, -1, -1, -1, -1, -1, -1]

 */
