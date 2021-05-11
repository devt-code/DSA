/*
editorial : https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
practice : https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
*/
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
        while(slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
        while(head != null) {
            int i = stack.pop();
            if(head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }
}

