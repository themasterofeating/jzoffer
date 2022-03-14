/*
* 整数数组 nums 按升序排列，数组中的值 互不相同 。

在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组
* 变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0
* 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。

给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/


public class Hot33 {
    public static void main(String[] args) {
        int[] kk = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(kk, 3));
    }

    static int key = 0;

    public static int search(int[] nums, int target) {
        if(nums.length==0) return -1;
        if (nums.length == 1) {
            if (nums[0] == target) {
                return key;
            } else {
                return -1;
            }
        } else if (nums[nums.length - 1] < target && nums[0] > target) {
            return -1;
        }else if(nums.length==2){
            if(nums[0]==target){
                return 0;
            }else if(nums[1]==target){
                return 1;
            }else return -1;
        }
        else {
            int mid = nums.length / 2;
            int a = nums[0];
            int b = nums[mid];
            if (b > a) {
                if (target == a) return key;
                else if (target == b) return mid + key;
                else if (target < b && target > a) {
                    int[] n1 = new int[mid + 1];
                    for (int i = 0; i <= mid; i++) {
                        n1[i] = nums[i];
                    }
                    return search(n1, target) == -1 ? -1 : search(n1, target);
                } else {
                    int[] n1 = new int[nums.length - mid - 1];
                    for (int i = 0; i < n1.length; i++) {
                        n1[i] = nums[i + mid + 1];
                    }
                    return search(n1, target) == -1 ? -1 : search(n1, target) + mid + 1;
                }
            } else {
                if (target > b && target < a) {
                    int[] n1 = new int[nums.length - mid - 1];
                    for (int i = 0; i < n1.length; i++) {
                        n1[i] = nums[i + mid + 1];
                    }
                    return search(n1, target) == -1 ? -1 : search(n1, target) + mid + 1;
                } else {
                    int[] n1 = new int[mid + 1];
                    for (int i = 0; i <= mid; i++) {
                        n1[i] = nums[i];
                    }
                    return search(n1, target) == -1 ? -1 : search(n1, target);
                }
            }
        }
    }
}
