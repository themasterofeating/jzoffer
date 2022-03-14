public class Hot124 {
    static int mmm=Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root){
        mmm=Integer.MIN_VALUE;
        int k=maxPath(root);
        if(mmm<0){
            return Math.max(mmm,root.val);
        }
        mmm=Math.max(mmm,k);
        return mmm;
    }
    public static int maxPath(TreeNode root) {
        int left1=0;
        int right1=0;
        if(root.left!=null){
            left1=maxPath(root.left);
            mmm=Math.max(mmm,left1);
        }
        if(root.right!=null){
            right1=maxPath(root.right);
            mmm=Math.max(mmm,right1);
        }
        left1=Math.max(left1,0);
        right1=Math.max(right1,0);
        return Math.max(0,left1+right1+root.val);
    }
}
