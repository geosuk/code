package codingbat;

import java.util.Scanner;

public class Array3_seriesUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] n2 = new int[n*(n+1)/2];
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=1; j<i+2; j++) {
				n2[count] = j;
				count ++;
			}
		}
		for(int i=0; i<n2.length; i++) {
			System.out.println(n2[i]);
		}
	}
}
