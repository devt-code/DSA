/*
editorial : https://www.geeksforgeeks.org/binary-search/
Practice : https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1
*/
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}// } Driver Code Ends


class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int x = Compute(arr,0,N-1,K);
        return x;
    }
    static int Compute(int arr[], int start, int end,int k) {
        if(end>=1) {
            int mid = (start+end)/2;
            if(arr[mid] == k) {
                return 1;
            }
            else if(arr[mid]>k) {
                return Compute(arr,start,mid-1,k);
            }
            else {
                return Compute(arr,mid+1,end,k);
            }
        }
        return -1;
    }
}