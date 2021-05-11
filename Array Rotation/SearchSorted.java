/*
editorial : https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/
*/

import java.util.*;
public class SearchSorted {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {3, 5, 1, 2};
		n = a.length;
		MaxVal(a,n);
	}
	static int MaxVal(int a[], int n) {
		int sum[] = new int[n-1];
		for(int i=0; i<n-1;i++) {
			sum[i] = compute(a,n);
		}
	}
	static int compute(int a[], int n) {
		int b[] = new int[n];
		b[0] = a[n];
		for(int i=1; i<n;i++) {
			b[i] = a[i-1];
		}
		for(int j=0;j<n;j++) {
			a[i] = b[i];
		}
		for(int j=0;<n;j++) {
			System.out.println(a[j]);
		}
	}
}