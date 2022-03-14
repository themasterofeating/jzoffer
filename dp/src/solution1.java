import java.util.ArrayList;
import java.util.HashSet;

public class solution1 {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring (String s) {
        if(s.length()==0){
            return 0;
        }
        // write code here
        char[] ch  = s.toCharArray();
        int len = ch.length;
        int[] dp = new int[len];
        int[] dp2 = new int[len];
        dp[0]=1;
        int mm=1;
        for(int i = 0;i<len;i++){
            ArrayList l1 = new ArrayList();
            HashSet s1 =new HashSet();
            dp[i]=1;
            dp2[i]=1;
            l1.add(ch[i]);
            s1.add(ch[i]);
            for(int j=i+1;j<len;j++){
                if(s1.contains(ch[j])){
                    dp[j]=0;
                    break;
                }else {
                    dp[j]=dp[j-1]+1;
                    s1.add(ch[j]);
                    mm=Math.max(mm,dp[j]);
                }
            }
        }
        return mm;
    }

}
