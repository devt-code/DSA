/*
editorial : https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
practice : https://practice.geeksforgeeks.org/problems/linked-list-insertion/1
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node temp = new Node(x);
        if(head == null) {
            head = new Node(x);
            return head;
        }
        temp.next = null;
        Node last = head;
        while(last.next!=null) {
            last = last.next;
        }
        last.next = temp;
        return head;
    }
}