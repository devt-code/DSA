/*
editorial : https://www.geeksforgeeks.org/write-a-function-that-counts-the-number-of-times-a-given-int-occurs-in-a-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1
*/
class Solution
{
    public static int count(Node head, int search_for)
    {
        //code here
        Node temp = head;
        int count = 0;
        while(temp != null) {
            if(temp.data == search_for) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }
}