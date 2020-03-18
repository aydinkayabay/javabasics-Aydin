package com.syntax.class10;

public class task3 {

	public static void main(String[] args) {
		int [] nums = {200,30,-1,900,56,787};
		
		int largest =nums[0];
		for (int i=1;i<nums.length;i++) {
				if (nums[i]>largest){
          largest =nums[i];
				}		
			
			
		}
		System.out.println("The largest num is "+largest);
	}		
		}	
		
	
	


