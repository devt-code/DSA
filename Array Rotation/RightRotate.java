import java.util.*;
public class RightRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int n = a.length;
		int k = 3;
		compute(a,n,k);
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}	
	}
	static void compute(int a[], int n,int k) {
		if(k>n) {
			k = k%n;
		}
		rotate(a,n-k,n-1);
		rotate(a,0,n-k-1);
		rotate(a,0,n-1);
	}
	static void rotate(int a[], int start, int end) {
		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}