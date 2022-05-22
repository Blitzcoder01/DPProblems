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
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        int[] arr= new int[]{ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        List<Integer> l= new ArrayList<>();
       
        int n=10;
        for(int i=n-1; i>=0;i--){
            if(N==0){
                break;
            }
            
            else if(N!=0 && arr[i]<=N){
                
                N= N-arr[i];
                l.add(arr[i]);
                i++;
            }
        }
        return l;
    }
}
