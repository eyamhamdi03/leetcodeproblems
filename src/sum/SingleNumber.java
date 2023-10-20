package sum;

import java.util.Scanner;

public class SingleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("numlength = ");
    	int n = sc.nextInt();
    	int[] nums = new int[n];

    	for(int i =0 ;i<n ; i++)
    	{
    		nums[i]= sc.nextInt();	    		
    	}
    	sc.close();
    	
    	 int result = nums[0]; 
        
         for (int i = 1; i < n; i++) {
             result = result ^ nums[i]; 
         }
         
         System.out.println("The Single Number = " + result);
     }
 }
    	
    	
	


