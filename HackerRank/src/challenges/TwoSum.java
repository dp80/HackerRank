package challenges;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum ts = new TwoSum();
		int[] arr = {2,1,9,4,4,56,90,38};
		
		int [] num = ts.twoSum(arr, 8);
		for(int i: num)
			System.out.print(i + " ");
	}

	
	 int[] twoSum(int[] nums, int target) {
		 int []arr = new int[2];
		 
		 for(int i = 0; i < nums.length; i++){
			 arr[0] = i;
			 for(int y = 1; y < nums.length; y++){
				 if(((nums[i] + nums[y]) == target) && i != y){
					 arr[1] = y;
					 return arr;
				 }
			 }	 
		 }
		return arr;
	        
	  }
}
