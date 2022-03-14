public class Cutshengzi {
    public static void main(String[] args) {
        System.out.println(cutlongRope(1000));
    }
    public static int cutRope(int target) {
        int max0 = 1;
        for(int i=2;i<target;i++){
            int num=target/i;
            int k=target%i;
            int n=1;
            n=n*(int)Math.pow(num,i-k);
            n=n*(int)Math.pow(num+1,k);
            max0=Math.max(max0,n);
        }
        return max0;
    }

    public static long cutlongRope(long target) {
        long max0 = 1l;
        for(long i=2l;i<target;i++){
            double num=target/i;
            long k=target%i;
            long n=1l;
            n=n*(long)Math.pow(num,i-k);
            n=n*(long)Math.pow(num+1,k);
            max0=Math.max(max0,n);
        }
        return max0;
    }

}
