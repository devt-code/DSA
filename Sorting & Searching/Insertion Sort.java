/*
editorial : https://www.geeksforgeeks.org/insertion-sort/
Practice : https://practice.geeksforgeeks.org/problems/insertion-sort/1#
*/
class Solution
{
  static void insert(int arr[], int i)
  {
       // Your code here
        int n = i;
        for(int  j = 1; j < n; ++j) {
            int key = arr[j];
            int k = j - 1;
            while(k >= 0 && arr[k] > key) {
                arr[k+1] = arr[k];
                k = k - 1;
            }
            arr[k + 1] = key;
        }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      insert(arr, n);
  }
}