public class Jzof094b {

    public static void main(String[] args) {
        System.out.println(minCut("aaabaa"));
    }
    public static int minnCut(String s) {
        return allCut(s,0);
    }
    public static int minCut(String s) {
        return minnCut(s)-1;
    }
    public static int allCut(String s, int num){
        int left=0;
        int su=s.length();
        for(int right=s.length();right>left;right--){
            if(Hui(s.substring(left,right))){
                su=Math.min(su,1+minnCut(s.substring(right,s.length())));
            }
        }
        return num+su;
    }
    public static boolean Hui(String s){
        char[] ch1 = s.toCharArray();
        for(int i=0;i<ch1.length/2;i++){
            if(ch1[i]!=ch1[ch1.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
