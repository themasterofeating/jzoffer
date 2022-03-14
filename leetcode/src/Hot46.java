import java.util.ArrayList;
import java.util.List;

public class Hot46 {
    public static void main(String[] args) {
        int[] aa={1,2,3};
        System.out.println(permute(aa));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ll1 = new ArrayList<>();
        if (nums.length == 0) {
            return null;
        } else if (nums.length == 1) {
            List<Integer> l1 = new ArrayList<>();
            l1.add(nums[0]);
            ll1.add(l1);
            return ll1;
        } else {
            int[] numss = new int[nums.length - 1];
            for (int i = 0; i < numss.length; i++) {
                numss[i] = nums[i];
            }
            List<List<Integer>> ll2 = permute(numss);
            List<List<Integer>> ll3 = new ArrayList<>();
            for (List<Integer> l2 : ll2) {
                for (int i = l2.size(); i >= 0; i--) {
                    List<Integer> l3 = new ArrayList<>(l2);
                    l3.add(i, nums[nums.length - 1]);
                    ll3.add(l3);
                }
            }
            return ll3;
        }

    }
}
