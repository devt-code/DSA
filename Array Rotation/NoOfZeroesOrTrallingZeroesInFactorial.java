/*
editorial & Practice : https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1#
*/
class Solution{
    static int trailingZeroes(int n){
        // Write your code here
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
    }
}