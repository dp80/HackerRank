package challenges;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {0,1};
		SummaryRanges sr = new SummaryRanges();
		List<String> ll = new ArrayList<String>();
		ll = sr.summaryRanges(n);
		
		for(String str: ll){
			System.out.print(str+",");
		}
	}
	
	List<String> summaryRanges(int[] nums) {
		 String value = "";
	        List<String> l = new ArrayList<String>();
	        if(nums.length == 1)
	            l.add(Integer.toString(nums[0]));
	        else if(nums.length == 0){
	        	return l;
	        }else{
	        	for(int i = 0; i < nums.length-1; i++){
	        		if(i == 0){
	        			value = Integer.toString(nums[0]);
	        		}else if(nums[i] == (nums[i-1] + 1) && nums[i]+1 == (nums[i+1])){
	        			continue;
	        		}else if(nums[i] == (nums[i-1] + 1) && nums[i]+1 != (nums[i+1])){
	        			value = value + "->"+nums[i];
	        			l.add(value);
	        			value = "";
	        		}else if(nums[i] != (nums[i-1] + 1) && nums[i]+1 == nums[i+1]){
	        			value = Integer.toString(nums[i]);
	        		}else if(nums[i] != nums[i-1]+1 && nums[i]+1 != (nums[i+1])){
	        			value = Integer.toString(nums[i]);
	        			l.add(value);
	        			value = "";
	        		}
	        		if ((i+1) == nums.length - 1){
	        		    if( value != "" && nums[i] != nums[i+1] ){
	        		        l.add(value);
	        		        l.add(Integer.toString(nums[i+1]));
	        		    }else if(value != ""){
	        				l.add(value + "->"+nums[i+1]);
	        			}else
	        				l.add(Integer.toString(nums[i+1]));
	        		}
	        	}
	        }

	        return l;
	}

}
	 