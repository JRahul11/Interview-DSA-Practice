// Longest Common Subsequence

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        char[] charArr1 = text1.toCharArray();
        char[] charArr2 = text2.toCharArray();
        
        int m = charArr1.length;
        int n = charArr2.length;
        
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                // Increment Diagonal value
                if(charArr1[i] == charArr2[j])
                {
                    dp[i+1][j+1] = 1 + dp[i][j];
                }
                // Max of upper and left values
                else
                {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[m][n];
    }
}

// Longest Common Substring

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        
        char[] charArr1 = S1.toCharArray();
        char[] charArr2 = S2.toCharArray();
        
        int[][] dp = new int[n+1][m+1];
        
        for(int i=0; i<n; i++)
        {
            for (int j = 0; j < m; j++) {
                if (charArr1[i] == charArr2[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = 0; // Change here
                }
            }
        }
        
        // Find the max element from the matrix for substring
        int maxLen = Integer.MIN_VALUE;
        
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=m; j++)
            {
                maxLen = Math.max(maxLen, dp[i][j]);
            }
        }
        return maxLen;
    }
}