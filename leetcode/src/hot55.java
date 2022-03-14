public class hot55 {
    public boolean canJump(int[] nums) {
        boolean[] dd=new boolean[nums.length];
        dd[0]=true;
        for(int i=0;i< dd.length;i++){
            if(dd[i]){
                for(int j=1;j<=nums[i]&&j+i<nums.length;j++){
                    dd[j+i]=true;
                }
            }
        }
        return dd[nums.length-1];
    }
}
