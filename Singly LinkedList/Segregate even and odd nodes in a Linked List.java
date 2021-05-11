/*
editorial : https://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list/
Practice : https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1
*/
class Solution{
    Node divide(int N, Node head){
        // code here
        // List<Integer> list1 = new ArrayList<Integer>();
        // List<Integer> list2 = new ArrayList<Integer>();
        // Node temp = head;
        // while(temp != null) {
        //     if(temp.data%2 == 0) {
        //         list1.add(temp.data);
        //     }
        //     else {
        //         list2.add(temp.data);
        //     }
        //     temp = temp.next;
        // }
        // list1.addAll(list2);
        // for(int num : list1) {
        //     System.out.print(num+" ");
        // }
        // return null;
        Node end = head;
        Node prev = null;
        Node curr = head;
        while (end.next != null)
            end = end.next;
  
        Node new_end = end;
        while (curr.data %2 !=0 && curr != end)
        {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if (curr.data %2 ==0)
        {
            head = curr;
            while (curr != end)
            {
                if (curr.data % 2 == 0)
                {
                    prev = curr;
                    curr = curr.next;
                }
                else
                {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        }
        else prev = curr;
  
        if (new_end != end && end.data %2 != 0)
        {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
        return head;
    }
}