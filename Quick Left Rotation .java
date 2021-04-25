/*
editorail : https://www.geeksforgeeks.org/quickly-find-multiple-left-rotations-of-an-array/
practice : https://practice.geeksforgeeks.org/problems/quick-left-rotation3806/1
*/


class Solution
{
    static void leftRotate(long a[], int k,int n)
    {
        while(k>n) {
            k = k-n;
        }
        //System.out.println(k);
        int x = 0;
        rotate(a,0,k-1);                          
        rotate(a,k,n-1);
        rotate(a,0,n-1);
    }
    static void rotate(long a[],int start,int end) {
        while(start<end) {
            long temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    
}