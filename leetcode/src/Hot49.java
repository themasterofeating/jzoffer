import java.util.ArrayList;
import java.util.List;

public class Hot49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ll1=new ArrayList<>();
        for(String s1:strs){
            boolean kk=true;
            for(List<String> l1:ll1){
                String s2=l1.get(0);
                    if(samee(s1,s2)){
                        l1.add(s1);
                        kk=false;
                        break;
                    }

            }
            if(kk){
                List<String> l2=new ArrayList<>();
                l2.add(s1);
                ll1.add(l2);
            }
        }
        return ll1;
    }
    public boolean samee(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    ch2[j]='0';
                    break;
                }
                if(j==ch2.length-1){
                    return false;
                }
            }
        }
        return true;
    }
}
