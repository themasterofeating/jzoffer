import java.util.List;

public class Hot139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<s.length()+1;i++){
            for(String s1:wordDict){
                if(s1.length()<=i){
                    if(s.substring(i-s1.length(),i).equals(s1)&&dp[i-s1.length()]){
                        dp[i]=true;
                        break;
                    }
                }
            }
        }
        return dp[s.length()];
    }


















//    public boolean wordBreak(String s, List<String> wordDict) {
//        if(s.length()==0){
//            return true;
//        }
//        for(String s1:wordDict){
//            int l=s1.length();
//            if(s.length()>=l){
//                if(s.substring(0,l).equals(s1)){
//                    if(wordBreak(s.substring(l),wordDict)){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }

}
