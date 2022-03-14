import java.util.Locale;

public class Jzof094 {
    public static void main(String[] args) {
        System.out.println(Hui("a"));
    }
    public int minCut(String s) {
        int i=-1;
        int left=0;
        while (true){
            for(int right=s.length();right>left;right--){
                if(Hui(s.substring(left,right))){
                    i++;
                    left=right;
                    break;
                }
            }
            if(left==s.length()){
                break;
            }
        }
        return i;
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
