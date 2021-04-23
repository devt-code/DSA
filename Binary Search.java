/*
editorial: https://www.geeksforgeeks.org/binary-search/
practice: https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1#

*/

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