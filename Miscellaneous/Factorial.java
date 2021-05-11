/*
editorial & Practice : https://practice.geeksforgeeks.org/problems/factorial5739/1/?company[]=Wipro&company[]=Wipro&page=1&query=company[]Wipropage1company[]Wipro#
*/
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.factorial(N));
        }
    }
}// } Driver Code Ends


class Solution{
    static long factorial(int n){
        // code here
        long fact = 1;
        for(long i = 1; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }
}