/*
editorial : https://www.geeksforgeeks.org/intersection-of-two-sorted-linked-lists/
practice : https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
*/
class Sol
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node temp1 = head1;
        Node temp2 = head2;
        //List<Integer> list1 = new ArrayList<Integer>();
        Node head = null;
        Node last= null;
        while(temp1 != null &&  temp2 != null) {
            if(temp1.data == temp2.data) {
                //list1.add(temp1.data);
                last = addAtEnd(last,temp1.data);
                if(head == null) head = last;
                
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1.data < temp2.data) {
                temp1 = temp1.next;
            }
            else {
                temp2 = temp2.next;
            }
        }
        
        return head;
    }
    
    private static Node addAtEnd(Node head, int data) {
        Node temp = head;
        
        if(temp == null) {
            Node newNode = new Node(data);
            return newNode;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        
        return newNode;
    }
}