import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Shujuliuzhongweishu {
    static ArrayList<Integer> l1 = new ArrayList<>();
    public void Insert(Integer num) {
        l1.add(num);
        l1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t1-t2;
            }
        });
    }

    public Double GetMedian() {
        int len=l1.size();
        if(len%2==1){
            return (double)l1.get((len-1)/2);
        }else {
            return (double)(((double)l1.get(len/2)+(double)l1.get(len/2-1))/2);
        }
    }
}
