// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int ans=0;
	    
	    int[] dp= new int[n];
	    for(int i=0; i<n;i++){
	        int max=0;
	       // int sum=0;
	        for(int j=0; j<i;j++){
	            if(arr[j]<arr[i]){
	                if(max==0){
	                    max= dp[j];
	                }
	                //sum= sum+arr[j];
	                else if(max< dp[j]){
	                    max= dp[j];
	                }
	            }
	            
	        }
	        if(max!=0)
	        dp[i]= max+arr[i];
	        
	        else
	        dp[i]= arr[i];
	        
	        
	        if(ans<dp[i]){
	            ans= dp[i];
	        }
	    }
	   // for(int i=0; i<n; i++){
	   //     System.out.print(dp[i]+" ");
	   // }
	    return ans;
	}  
}
