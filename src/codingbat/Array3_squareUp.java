package codingbat;

import java.util.Scanner;

public class Array3_squareUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] n2 = new int[n*n];
		int[] n3 = new int[n*n];
		int[] n4 = new int[n*n];
		
		//1. 죠지님이푼거
		for(int k = 0; k < n; k++){
		    for(int i = 0; i < n*n; i++){
		      for(int j = 0; j < n-k; j++){
		        n3[(n*n)-(j+1)-(n*k)] = 1+j;
		      };
		    }
		  }
		//2. 내가푼거
		for(int i=n-1; i<n2.length; i+=n){
		    for(int j=i; j>=i-i/n; j--){
		      n2[j] = i-j+1;
		    }
		  }
		//3. 선생님이 푼거 ㄹㅇ 완벽;;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				n4[n*i-j] = j;
			}
		}
		
		for(int i=0; i<n*n; i++) {
			System.out.println(n4[i]);
		}
		
	}
}
