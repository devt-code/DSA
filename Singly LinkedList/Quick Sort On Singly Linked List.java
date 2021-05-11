/*
editorial : https://www.geeksforgeeks.org/quicksort-on-singly-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/quick-sort-on-linked-list/1#
*/
class GfG
{
    public static Node quickSort(Node head)
    {
        //Your code here
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        sort(head, last);
        return head;
    }
    static void sort(Node start, Node end) {
        if(start == null || start == end || start == end.next )
            return;
         Node pivot_prev = paritionLast(start, end);
         sort(start, pivot_prev);
         if (pivot_prev != null && pivot_prev == start)
             sort(pivot_prev.next, end);
         else if (pivot_prev != null
                  && pivot_prev.next != null)
             sort(pivot_prev.next.next, end);
    }
    static Node paritionLast(Node start, Node end)
     {
        if (start == end || start == null || end == null)
            return start;
        Node pivot_prev = start;
        Node curr = start;
        int pivot = end.data;
        while (start != end) {
            if (start.data < pivot) {
                pivot_prev = curr;
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }
        int temp = curr.data;
        curr.data = pivot;
        end.data = temp;
        return pivot_prev;
    }
}