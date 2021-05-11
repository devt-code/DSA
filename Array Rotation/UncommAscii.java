import java.util.*;
public class UncommAscii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a[] = {'A', 'B', 'C'};
		char b[] = {'B', 'C'};
		int  x = Compute(a,b);
		System.out.println(x);
	}
	
	public static int Compute(char a[], char b[]) {
		int j=0,sum=0;
		for(int i=0;i<a.length;i++) {
			j=0;
			while(j<b.length) {
				if(a[i]!=b[j]) {
					j++;
				}
				else {
					break;
				}
			}
			if(j==b.length) {
				sum = sum+(int)a[i];
			}
		}
		int sum1=0,r=0,sum2=0;
		while(sum>=10) {
			while(sum!=0) {
				r=sum%10;
				sum1 = sum1+r;
				sum=sum/10;
			}
			sum = sum1;
			sum1 = 0;
		}
		return sum;
	}
}