/*
editorial : https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
*/
class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node temp = head;
         int count = 0;
         while(temp != null) {
             count++;
             temp = temp.next;
         }
         int n = (count/2)+1;
         temp = head;
         for(int i = 1; i < n; i++) {
             temp = temp.next;
         }
         return temp.data;
    }
}
