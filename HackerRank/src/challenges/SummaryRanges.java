package challenges;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {0,1,3,4,7,9};
		SummaryRanges sr = new SummaryRanges();
		List<String> ll = new ArrayList<String>();
		ll = sr.summaryRanges(n);
		
		for(String str: ll){
			System.out.print(str+",");
		}
	}
	
	List<String> summaryRanges(int[] nums) {
	 	int start;
 		int end;
        List<String> l = new ArrayList<String>();
        if(nums.length == 1){
            l.add(Integer.toString(nums[0]));
        }else if(nums.length == 0){
        	return l;
        }
        start = nums[0];
        end = start;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==start+1){
                if(i == nums.length-1){
                    l.add(end+"->"+nums[i]);
                }
            }else{
                if(end == start){
                    l.add(end + "");
                }else{
                    l.add(end + "->" + start);   
                }
 
                if(i==nums.length-1){
                    l.add(nums[i] + "");
                }
 
                end = nums[i];
            }
 
            start = nums[i];
        }
        return l;
	}

}
	 