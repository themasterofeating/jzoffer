public class Jzof094c {
    public static void main(String[] args) {
        System.out.println(minCut("aabaa"));
    }
    public static int minCut(String s) {

        if(s.length()==0) return 0;
        int[] n1=new int[s.length()];
        for(int i=0;i<s.length();i++){
            n1[i]=i;
        }
        for(int left=0;left<s.length();left++){
            for(int right=left+1;right<s.length()+1;right++){
                if(Hui(s.substring(left,right))){
                    n1[right-1]=Math.min(n1[right-1],left==0?0:n1[left-1]+1);
                }
            }
        }
        return n1[s.length()-1];
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
