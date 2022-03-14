public class Hot72 {
    public static void main(String[] args) {
        System.out.println(minDistance("horse","ros"));
    }
    public static int minDistance(String word1, String word2) {
        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        int[][] dp=new int[w1.length+1][w2.length+1];
        for(int i=0;i<w1.length+1;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<w2.length+1;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<w1.length+1;i++){
            for(int j=1;j<w2.length+1;j++){
                if(w1[i-1]!=w2[j-1]){
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }else {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]-1)+1;
                }
            }
        }
        return dp[w1.length][w2.length];
    }
}
