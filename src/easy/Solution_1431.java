package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1431 {
	    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) { //내가 푼거^^
	        int[] arr = new int[candies.length];
	        for(int i=0; i<arr.length; i++) {
	        	arr[i]=candies[i];
	        }
	        Arrays.sort(arr);
	        ArrayList<Boolean> a = new ArrayList<>();
	        for(int i=0; i<arr.length; i++) {
	        	if(candies[i]+extraCandies>=arr[arr.length-1]) {
	        		a.add(true);
	        	}else {
	        		a.add(false);
	        	}
	        }
	        return a;
	    }
	    public List<Boolean> kidsWithCandies2(int[] candies, int extraCandies){ // 인터넷 ^^
	    	List<Boolean> rst = new ArrayList<>();
	    	int max = -1;
	    	for(int c : candies) max = Math.max(max, c);
	    	for(int i=0; i<candies.length; i++) {
	    		rst.add(max-candies[i]<=extraCandies ? true : false);
	    	}
	    	return rst;
	    }
	    public static void main(String[] args) {
	    	Solution_1431 n = new Solution_1431();
	    	int[] num = {12,1,12};
	    	int[] s = new int[num.length];
	    	for(int i=0; i<num.length; i++) {
	    		s[i]=num[i];
	    	}
	    	Arrays.sort(s);
	    	int n1 = 10;
	    	ArrayList<Boolean> a = new ArrayList<>();
	    	
	    	for(int i=0; i<num.length; i++) {
	    		if(n1+num[i]>=s[s.length-1]) {
	    			a.add(true);
	    		}else {
	    			a.add(false);
	    		}
	    		System.out.println(a.get(i));
	    	}
	    	System.out.println(s[0]);
	    	
		}
	
}
