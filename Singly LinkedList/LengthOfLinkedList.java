/*
editorial :https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/
Practice : https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
*/
Iterative : 
class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        Node temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
Recurcive : 
public int getCountRec(Node node)
    {
        // Base case
        if (node == null)
            return 0;
  
        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }
  
    /* Wrapper over getCountRec() */
    public int getCount()
    {
        return getCountRec(head);
    }