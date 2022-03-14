//public class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//}

public class question1 {
    static int maxx=1;
    public int TreeDepth(TreeNode root) {
        int i = 1;
        if(root==null){
            return 0;
        }
        dfs(root,i);
        return maxx;
    }
    void dfs(TreeNode tn1,int num) {
        if (tn1.left != null&&tn1.left.val!=-1) {

            dfs(tn1.left,num+1);
        }
        if(tn1.right != null&&tn1.right.val!=-1){

            dfs(tn1.right,num+1);
        }
        tn1.val=-1;
        maxx=Math.max(maxx,num);
    }
}
