package 백준;

import java.util.Scanner;

public class beakjoon_1192 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0; //몇번째 줄인가?
		int count  = 0;
		while(true) {
			for(int i=0; i<=x; i++) {
				count++;
			}
			x++;
			if(count>=n) {
				break;
			}
		}
		if(x%2==0) { //짝수 일 경우
			int top = x-(count-n);
			int bottom = count-n+1;
			System.out.println(top+"/"+bottom);
		}else { //홀수 일 경우
			int top = count-n+1;
			int bottom = x-(count-n);
			System.out.println(top+"/"+bottom);
			
		}
		
	
	}
}
