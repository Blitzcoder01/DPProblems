class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<n+1;i++){
            for(int j=0; j<m+1; j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(Y.charAt(i-1)==X.charAt(j-1)){
                    dp[i][j]= 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int L1= X.length()- dp[n][m];
        int L2= Y.length()- dp[n][m];
        return L1+L2+dp[n][m];
    }
}
