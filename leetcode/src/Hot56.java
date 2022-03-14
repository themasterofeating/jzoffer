import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hot56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return null;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        List<int[]> l1=new ArrayList<>();
        l1.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] n=l1.get(l1.size()-1);
            if(n[1]>=intervals[i][0]){
                l1.remove(l1.size()-1);
                int[] k={Math.min(n[0],intervals[i][0]),Math.max(n[1],intervals[i][1])};
                l1.add(k);

            }else {
                l1.add(intervals[i]);
            }
        }
        int[][] mm=new int[l1.size()][2];
        for(int i=0;i<l1.size();i++){
            mm[i][0]=l1.get(i)[0];
            mm[i][1]=l1.get(i)[1];
        }
        return mm;
    }
}
