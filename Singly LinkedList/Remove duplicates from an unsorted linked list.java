/*
editorial : https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
*/
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer> hs = new HashSet<>();
         Node current = head;
         Node prev = null;
         while (current != null) {
            int curval = current.data;
            if (hs.contains(curval)) {
                prev.next = current.next;
            }
            else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}
