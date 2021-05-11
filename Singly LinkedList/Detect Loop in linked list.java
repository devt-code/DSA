/*
editorial : https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
*/
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        while(head != null) {
            if(head.data == -1) return true;
            else {
                head.data = -1;
                head = head.next;
            }
        }
        return false;
    }
}