package easy;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int[] a = {3,5,2,7,1,2};
	    int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		Arrays.sort(b);
		System.out.println(a[0]);
		System.out.println(b[0]);
	}
}
