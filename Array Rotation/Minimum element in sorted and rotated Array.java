/*
editorial : https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
Practice : https://practice.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1
*/
class Solution
{
    int findMin(int a[], int n)
    {
        //complete the function here
        int min = a[0];
        for(int i=0; i<n; i++) {
            if(a[i]<min) {
                min = a[i];
                //break;
            }
        }
        return min;
    }
}
