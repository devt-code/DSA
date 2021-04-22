/*
editorial: https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/
practice: https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

*/

class Compute {
    
    public void rotate(long arr[], long n)
    {
        long last = arr[(int)n-1];
        int i;
        for(i=(int)n-1;i>0;i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}