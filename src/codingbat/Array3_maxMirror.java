package codingbat;

public class Array3_maxMirror {
public static void main(String[] args) {
	int[] nums = {1,2,3,4,4,3,2,1};
	int count =0 ;
//	for(int i=0 , j=nums.length-1; i<nums.length && j>=0; i++ ,j-- ){
//	    if(nums[i]==nums[j]){
//	      count++;
//	    }
//	  }
	int x=0; 
	int y=nums.length-1;
	int count2 = 0;
	while(x<nums.length) {
		System.out.println(x);
		if(nums[x]==nums[y]) {
			count2++;
			if(nums[x]!=nums[y]) {
				break;
			}
		}
		x++;
		y--;
	}
	System.out.println(count2);
}
}
