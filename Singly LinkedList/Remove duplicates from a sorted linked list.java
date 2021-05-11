/*
editorial : https://www.geeksforgeeks.org/remove-duplicates-from-a-sorted-linked-list/
practice : https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
*/
class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	    Node curr = head;
	    while(curr != null) {
	        Node temp = curr;
	        while(temp != null && temp.data == curr.data) {
	            temp = temp.next;
	        }
	        curr.next = temp;
	        curr = curr.next;
	    }
	    return head;
    }
}
