import java.util.ArrayList;

public class Jzof017 {
    public String minWindow(String s, String t) {
        if(CCtin(s,t)&&s.length()==t.length()){
            return s;
        }
        for (int i = t.length(); i <=s.length(); i++) {
            for (int j = 0; j <= s.length() - i; j++) {
                if (CCtin(s.substring(j, j + i), t)) {
                    return s.substring(j, j + i);
                }
            }
        }
        return "";
    }

    public boolean CCtin(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        ArrayList a1 = new ArrayList<Character>();
        for (char cc : c1) {
            a1.add(cc);
        }
        for (char cc : c2) {
            if (a1.contains(cc)) {
                a1.remove(a1.indexOf(cc));
            } else {
                return false;
            }
        }
        return true;
    }
}
