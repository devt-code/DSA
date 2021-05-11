/*
editorial : https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
Practice : https://practice.geeksforgeeks.org/problems/rotation4723/1
*/
// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int a[], int n) {
        // code here
        int min = a[0];
        for(int i=0;i<n;i++) {
            if(a[i]<min) {
                min = i;
                break;
            }
        }
        if(min == a[0]) {
            return 0;
        }
        return min;
    }
}