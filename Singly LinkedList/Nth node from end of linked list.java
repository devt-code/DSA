/*
editorial : https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
*/
class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node temp = head;
    	int count = 0;
    	while(temp != null) {
    	    count++;
    	    temp = temp.next;
    	}
    	if(n > count) return -1;
    	n = (count-n)+1;
    	temp = head;
    	for(int i = 1; i < n; i++) {
    	    temp = temp.next;
    	}
    	return temp.data;
    }
}
