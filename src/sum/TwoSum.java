package sum;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
			    	Scanner sc = new Scanner(System.in);
			    	System.out.println("numlength = ");
			    	int n = sc.nextInt();
			    	int[] nums = new int[n];
			    	HashMap<Integer, Integer> numMap = new HashMap<>();
			    	
			    	
			    	for(int i =0 ;i<n ; i++)
			    	{
			    		nums[i]= sc.nextInt();	    		
			    	}
			    	
			    	
			    	System.out.println("target = ");
			    	int target = sc.nextInt();
			    	sc.close();
			       int i=0;
			    	 for ( i = 0; i < nums.length; i++) {
				            int complement = target - nums[i];
				            
				            if (numMap.containsKey(complement)) {
				             	    System.out.println("["+numMap.get(complement)+", "+ i+"]");
				             	    break;
				            }
				            numMap.put(nums[i], i);
				        }
			    	 
			    	 if( (!(numMap.containsKey(target-nums[n-1]))&&(i==n) ))
			    	 {
			    		 System.out.println("NOT FOUND");
			    	 }
			    	 

	}
		      
		        
		      


	}

