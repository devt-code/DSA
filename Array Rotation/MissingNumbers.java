/*
editorial & Practice : https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1#
*/
class Solution {
    int MissingNumber(int a[], int n) {
        // Your Code Here
        int sum = 0;
        for(int i = 0; i < n-1; i++) {
            sum = sum+a[i];
        }
        return ((n*(n+1))/2)-sum;
    }
}