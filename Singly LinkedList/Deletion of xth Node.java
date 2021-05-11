/*
editoial : https://www.geeksforgeeks.org/linked-list-set-3-deleting-node/
practice : https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	    Node temp = head;
	    if(x == 1) head = temp.next;
	    for(int i = 1; i < x-1; i++) {
	        temp = temp.next;
	    }
	    temp.next = (temp.next).next;
	    return head;
    }
}
