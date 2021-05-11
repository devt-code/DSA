/*
editorial : https://www.geeksforgeeks.org/find-length-of-loop-in-linked-list/
Practice: https://practice.geeksforgeeks.org/problems/find-length-of-loop/1
*/
class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow_p = head, fast_p = head; 
        while (slow_p !=null && fast_p!=null && fast_p.next!=null) { 
            slow_p = slow_p.next; 
            fast_p = fast_p.next.next;
        if (slow_p == fast_p) 
            return countNodes(slow_p); 
        }
        return 0; 
    }
    static int countNodes( Node n) 
    { 
        int res = 1; 
        Node temp = n; 
        while (temp.next != n) 
        { 
            res++; 
            temp = temp.next; 
        } 
        return res; 
    } 
}