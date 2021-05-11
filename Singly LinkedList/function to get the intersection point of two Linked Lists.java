/*
editorial : https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
practice : https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
*/
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
        //  Node temp1 = head1;
        //  Node temp2 = head2;
        //  int x = 0;
        //  while(temp1 != null && temp2 != null) {
        //      if(temp1.data == temp2.data) {
        //          x = temp1.next.data;
        //      }
        //      temp1 = temp1.next;
        //      temp2 = temp2.next;
        //  }
        //  return x;
        Node temp1 = head1;
        Node temp2 = head2;
        if (temp1 == null || temp2 == null) {
            return -1;
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (temp1 == temp2) {
                return temp1.data;
            }
            if (temp1 == null) {
                temp1 = head2;
            }
            if (temp2 == null) {
                temp2 = head1;
            }
        }
        return temp1.data;
	}
}


