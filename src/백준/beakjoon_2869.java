package 백준;

import java.util.Scanner;

public class beakjoon_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
//		int sum = 0; //올라간 거리
//		int count = 0; //며칠인가?

		int count1 = (V-B)/(A-B); //마지막날 미끌어지는 걸 빼고 나눔.
		if((V-B)%(A-B)!=0) { // 만약 나머지가있다면? 하루가 더 소요되므로 +1
			count1++;
		}
		System.out.println(count1);
//				while(sum<V) {
//				count++; //하루가 지나간다
//				sum+=A; //올라갈때
//				if(sum>=V) {
//					break;
//					
//				}
//				sum-=B;//미끌어진다
//			}
	//
//			System.out.println(count);
	}
}
