/*
editorial : https://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/
practice : https://practice.geeksforgeeks.org/problems/max-sum-in-the-configuration/1#
*/

import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}
// } Driver Code Ends


class GfG
{
    int max_sum(int arr[], int n)
    {
	// Your code here
	    int cum_sum = 0;
        for (int i = 0; i < n; i++)
            cum_sum += arr[i];
        int curr_val = 0;
        for (int i = 0; i < n; i++)
            curr_val += i * arr[i];
        int res = curr_val;
        for (int i = 1; i < n; i++)
        {
            int next_val = curr_val - (cum_sum -arr[i-1]) + arr[i-1] *(n-1);
            curr_val = next_val;
            res = Math.max(res, next_val);
        }
        return res;
    }
}
śś