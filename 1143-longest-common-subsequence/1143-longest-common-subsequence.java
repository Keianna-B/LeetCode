class Solution {
    private Integer[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new Integer [text1.length()][text2.length()];
        return helper(text1,text2, 0, 0);
    }
    public int helper(String t1, String t2, int i, int j){
        if(i == t1.length() || j == t2.length()){
            return 0;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }

        if(t1.charAt(i) == t2.charAt(j)){
            dp[i][j] = 1 + helper(t1, t2, i+1, j+1);
            return dp[i][j];
        }
        else{
            dp[i][j] = Math.max(helper(t1, t2,i+1, j), helper(t1,t2, i, j+1));
            return dp[i][j];
        }
    }
}