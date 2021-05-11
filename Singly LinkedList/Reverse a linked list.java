/*
editorial : https://www.geeksforgeeks.org/reverse-a-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
*/
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        // Stack<Integer> s = new Stack<Integer>();
        // Node temp = head;
        // int count = 0;
        // while(temp != null) {
        //     count++;
        //     s.add(temp.data);
        // }
        // for(int i = 0; i < count; i++) {
        //     System.out.print(s.pop());
        // }
        // return null;
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}
