/*
editorial : https://www.geeksforgeeks.org/search-an-element-in-a-linked-list-iterative-and-recursive/
*/
Iterative : 
public boolean search(Node head, int x)
    {
        Node current = head;    //Initialize current
        while (current != null)
        {
            if (current.data == x)
                return true;    //data found
            current = current.next;
        }
        return false;    //data not found
    }
Recusive : 
 public boolean search(Node head, int x)
    {
        // Base case
        if (head == null)
            return false;
  
        // If key is present in current node,
        // return true
        if (head.data == x)
            return true;
  
        // Recur for remaining list
        return search(head.next, x);
    }