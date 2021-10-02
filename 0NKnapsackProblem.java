class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        int[][] dp= new int[W+1][N+1];
        for(int i=0; i<W+1; i++){
            for(int j=0; j<N+1; j++){
                if(i==0|| j==0){
                    dp[i][j]= 0;
                }
                else if(wt[j-1]<=i){
                    dp[i][j]= Math.max(val[j-1]+dp[i-wt[j-1]][j], dp[i][j-1]);
                }
                else{
                    dp[i][j]= dp[i][j-1];
                }
            }
        }
        return dp[W][N];
    }
}
