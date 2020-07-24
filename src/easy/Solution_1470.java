package easy;

public class Solution_1470 {
	public int[] shuffle(int[] nums, int n) {
		int[] x = new int[n*2];
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<n*2; i=i+2) {
			x[i] = nums[count1];
			count1++;
		}
		for(int i=1; i<n*2; i=i+2) {
			x[i] = nums[count2];
			count2++;
		}
		
		return x;
	}
	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int[] x = new int[nums.length];
		int n=3;
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<n*2; i=i+2) {
			x[i] = nums[count1];
			count1++;
		}
		for(int i=1; i<n*2; i=i+2) {
			x[i] = nums[count2+n];
			count2++;
		}
		for(int i=0; i<n*2; i++) {
			System.out.print(x[i]+" ");
		}
		
		
	}
}
