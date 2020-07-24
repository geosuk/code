package easy;

public class Solution_1480 {
	public int[] runningSum(int[] nums) {
		for(int i=1; i<nums.length; i++) {
			nums[i]+=nums[i-1];
		}
		return nums;
	}
	public static void main(String[] args) {
		Solution_1480 s = new Solution_1480();
		int[] n = {1,2,3,4,5};
		int[] d = s.runningSum(n);
		for(int i=0; i<d.length; i++) {
			System.out.print(d[i]+" ");
		}
	}
}
