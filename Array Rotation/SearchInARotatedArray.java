/*
editorial : https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
Practice : https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
*/
// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

// 1) Find middle point mid = (l + h)/2
// 2) If key is present at middle point, return mid.
// 3) Else If arr[l..mid] is sorted
//     a) If key to be searched lies in range from arr[l]
//       to arr[mid], recur for arr[l..mid].
//     b) Else recur for arr[mid+1..r]
// 4) Else (arr[mid+1..r] must be sorted)
//     a) If key to be searched lies in range from arr[mid+1]
//       to arr[r], recur for arr[mid+1..r].
//     b) Else recur for arr[l..mid] 

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // Complete this function
        int mid = (l+h)/2;
        if(l>h) return -1;
        if(A[mid]==key) return mid;
        else if(A[mid]>A[l]) {
            if(key<A[mid]&&key>=A[l]) {
                return search(A,l,mid-1,key);
            }
            else {
                return search(A,mid+1,h,key);
            }
        }
        else {
            if(key>A[mid]&&key<=A[h]) {
                return search(A,mid+1,h,key);
            }
            else {
                return search(A,l,mid-1,key);
            }
        }
    }
}