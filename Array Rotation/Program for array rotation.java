/*
editorial : https://www.geeksforgeeks.org/array-rotation/
Practice : https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int z=1;z<=t;z++) {
		    //String read = sc.nextLine();
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            
    		int n = Integer.parseInt(st.nextToken());
    		int x = Integer.parseInt(st.nextToken());
    		int a1[] = new int[n];
    		//read = sc.nextLine();
    		
    		st = new StringTokenizer(sc.nextLine());
    		
    		for(int i=0;i<n;i++) {
    			a1[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		int a2[] = new int[n];
    		int j=0;
    		int k=0;
    		while(k<n-x) {
    			while(j<n-x) {
    				a2[j]=a1[k+x];
    				j++;
    				k++;
    			}
    		}
    		int m=n-x;
    		int o=0;
    		while(m<n) {
    			while(o<x) {
    				a2[m]=a1[o];
    				m++;
    				o++;
    			}
    		}
    		for(int l=0;l<n;l++) {
    			System.out.print(a2[l] + " ");
    		}
    		
    		    System.out.println();
		}
		
		
	}
}