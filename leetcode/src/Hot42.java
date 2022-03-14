public class Hot42 {
    public static void main(String[] args) {
        int[] kk={4,2,0,3,2,5};
        System.out.println(trap(kk));
    }
    public static int trap(int[] height) {
        int s = 0;
        int max = 0;
        for (int h : height) {
            s += h;
            max = Math.max(h, max);
        }
        int lm = 0;
        int rm = 0;
        int zz = 0;
        for (int i = 0; i < height.length; i++) {
            if(height[i]<max){
                if(height[i]>=zz){
                    zz=height[i];
                }else {
                    height[i]=zz;
                }
            }else{
                lm=i;
                break;
            }
        }
        zz=0;
        for(int i=height.length-1;i>=0;i--){
            if(height[i]<max){
                if(height[i]>=zz){
                    zz=height[i];
                }else {
                    height[i]=zz;
                }
            }else{
                rm=i;
                break;
            }
        }
        for(int i=lm;i<=rm;i++){
            height[i]=max;
        }
        int all=0;
        for(int h:height){
            all+=h;
        }
        return all-s;
    }

}
