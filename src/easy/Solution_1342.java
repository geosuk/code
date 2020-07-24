package easy;

public class Solution_1342 {
	public int numberOfSteps (int num) {
        int count = 0;
        while(num!=0) {
        	if(num%2==0) {
        		num/=2;
        		count++;
        	}else {
        		num-=1;
        		count++;
        	}
        }
		return count;
    }
	
	public static void main(String[] args) {
		int num = 123;
		int count = 0;
		while(num!=0) {
			if(num%2==0) {
				num/=2;
				count++;
			}else {
				num-=1;
				count++;
			}
		}
		System.out.println(count);
	}
}
