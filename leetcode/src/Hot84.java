public class Hot84 {
    public static void main(String[] args) {
        int[] aaaa={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(aaaa));
    }
    public static int largestRectangleArea(int[] heights){
        if(heights.length==1)return heights[0];
        int[][] dp=new int[heights.length][heights.length];
        int mm=0;
        for(int i=0;i<heights.length;i++){
            dp[i][i]=heights[i];
            mm=Math.max(mm,dp[i][i]);
            for(int j=i+1;j<heights.length;j++){
                dp[i][j]=Math.min(heights[j],dp[i][j-1]);
                mm=Math.max(mm,dp[i][j]*(j-i+1));
            }
        }
        return mm;
    }
}
