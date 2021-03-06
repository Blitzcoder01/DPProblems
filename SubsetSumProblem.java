// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] dp= new boolean[sum+1][N+1];
        for(int i=0; i<sum+1; i++){
            for(int j=0; j<N+1; j++){
                if(i==0 && j==0){
                    dp[i][j]= true;
                }
                else if(j==0){
                    dp[i][j]= false;
                }
                else if(i==0){
                    dp[i][j]= true;
                }
                else if(arr[j-1]<=i){
                    dp[i][j]= dp[i-arr[j-1]][j-1] || dp[i][j-1];
                }
                else{
                    dp[i][j]= dp[i][j-1];
                }
            }
        }
        return dp[sum][N];
    }
}
