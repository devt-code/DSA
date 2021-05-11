/*
editorial : https://www.geeksforgeeks.org/write-a-function-to-get-nth-node-in-a-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1
*/
class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       Node temp = node;
       for(int i = 1; i < ind; i++) {
           temp = temp.next;
       }
       return temp.data;
    }
}