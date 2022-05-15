// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        // code here
        for(int i=0; i<N; i++){
            sum= sum+arr[i];
        } 
        if(sum%2==0){
            boolean[][] dp= new boolean[(sum/2)+1][N+1];
            for(int i=0; i<(sum/2)+1; i++){
                for(int j=0; j<N+1; j++){
                    if(i==0 && j==0){
                        dp[i][j]=true;
                    } 
                    else if(i==0){
                        dp[i][j]=true;
                        
                    }
                    else if(j==0){
                        dp[i][j]=false;
                    }
                    else if(arr[j-1]<= i){
                        dp[i][j]= dp[i-arr[j-1]][j-1] || dp[i][j-1];
                    }
                    else{
                        dp[i][j]= dp[i][j-1];
                    }
                }
            }
            if(dp[(sum/2)][N]==true){
                return 1;
            }
            
        }
        
            return 0;
        
    }
}
