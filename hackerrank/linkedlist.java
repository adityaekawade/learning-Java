/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    
    //head is like firstlink in the linkedlist
    
    if (head == null) return false;  //if head = null means no link is added
    
    Node slow = head; //creates a variable named slow and points it to the first link(head) in the linkedlist
    Node fast = head.next; //creates a variable named fast and points it to the next link of head in the linkedlist
    
    //Logic is it the linkedlist is not cyclic, slow will never equal to fast. 
    
    while (slow != fast) { 
        if (fast == null || fast.next == null) return false;  //checks if the next link is null, then it shows that there is no link ahead, which means it is not cyclic. 
        
        slow = slow.next; // takes the reference to the next link in the linkedlist
        fast = fast.next.next; //takes the reference to the next to next link in the linkedlist
    }
    
    return true;

}
