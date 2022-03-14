import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hot301 {
    public static void main(String[] args) {
        System.out.println(removeInvalidParentheses(")("));
        System.out.println("".length());
        System.out.println(removeInvalidParentheses(")(").get(0));
    }

    static int m=-1;
    public static List<String> removeInvalidParentheses(String s) {
        List<String> l1 = new ArrayList<>();
        int left = 0, right = 0;
        if(s.length()==0){
            l1.add("");
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else if (s.charAt(i) == ')') {
                right++;
            }
            if (right > left) {
                for(int j=0;j<=i;j++){
                    String s1=s.substring(0,j)+s.substring(j+1,i+1);
                    if(can(s1)==0){
                        l1.addAll(removeInvalidParentheses(s1+s.substring(i+1)));
                    }
                }
                break;
            }
            if(i==s.length()-1){
                if(left==right){
                    l1.add(s);
                    m=Math.max(m,s.length());
                }else {
                    for(int j=0;j<=i;j++){
                        if(s.charAt(j)=='('){
                            String s2=s.substring(0,j)+s.substring(j+1,i+1);
                            l1.addAll(removeInvalidParentheses(s2));
                        }
                    }
                }
            }
        }
        if(l1.size()==0){
            l1.add("");
            return l1;
        }
        Set<String> s1=new HashSet();
        for(String s3:l1){
            if(s3.length()==m){
                s1.add(s3);
            }

        }
        List<String> ll=new ArrayList<>();
        for(String sss:s1){
            ll.add(sss);
        }
        return ll;
    }

    public static int can(String s) {
        char[] ch1 = s.toCharArray();
        int left = 0;
        int rigth = 0;
        for (char c1 : ch1) {
            if (c1 == '(') {
                left++;
            } else if (c1 == ')') {
                rigth++;
            }
            if (rigth > left) {
                return -1;
            }
        }
        return rigth - left;
    }
}
