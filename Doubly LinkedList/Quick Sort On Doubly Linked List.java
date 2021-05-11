/*
editorial : https://www.geeksforgeeks.org/quicksort-for-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/quicksort-on-doubly-linked-list/1
*/
class GfG
{
    public static Node partition(Node l, Node h)
    {
        //code here.
        
        int pivot = h.data;
        Node i = l.prev;
        for(Node j = l; j != h; j = j.next) {
             if(j.data <= pivot) {
                i = (i==null) ? l : i.next;
                int temp = i.data;
                i.data = j.data;
                j.data = temp;
            }
        }
        i = (i == null) ? l : i.next;
        int t1 = i.data;
        i.data = h.data;
        h.data = t1;
        return i;
    }
}