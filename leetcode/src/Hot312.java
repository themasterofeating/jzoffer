public class Hot312 {
    public static void main(String[] args) {
        int[] a={3,1,5,8};
        System.out.println(maxCoins(a));
    }
//    public static int maxCoins(int[] nums) {
//        if(nums.length==1) return nums[0];
//        int ss=0;
//        int kk=1;
//        int yy=0;
//        for(int i=0;i<nums.length;i++){
//            if(i==0){
//                kk=nums[i]*nums[i+1];
//            }else if(i==nums.length-1){
//                kk=nums[i]*nums[i-1];
//            }else {
//                kk=nums[i]*nums[i-1]*nums[i+1];
//            }
//            yy=Math.max(yy,kk+maxCoins(out(nums,i)));
//        }
//        return yy;
//    }

    public static int maxCoins(int[] nums){
        int add=0;
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            if(nums[0]>nums[1]){
                return nums[0]*nums[1]+nums[0];
            }else {
                return nums[0]*nums[1]+nums[1];
            }
        }
        int min=nums[1];
        for(int i=1;i<nums.length-1;i++){
            min=Math.min(min,nums[i]);
        }
        for (int i=1;i<nums.length-1;i++){
            if(nums[i]==min){
                return nums[i]*nums[i-1]*nums[i+1]+maxCoins(out(nums,i));
            }
        }
        return nums[0]*nums[1]*nums[2]+maxCoins(out(nums,1));
    }
    public static int[] out(int[] nums,int n){
        if(nums.length<=1){
            return null;
        }
        int[] k=new int[nums.length-1];
        for(int i=0;i<n;i++){
            k[i]=nums[i];
        }
        for(int i=n;i<nums.length-1;i++){
            k[i]=nums[i+1];
        }
        return k;
    }
}
