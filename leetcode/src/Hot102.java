import java.util.ArrayList;
import java.util.List;

public class Hot102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return null;
        }
        List<List<Integer>> l1=new ArrayList<>();
        return level(root,l1,0);
    }
    public List<List<Integer>> level(TreeNode root,List<List<Integer>> l1,int de){
        if(l1.size()<de+1){
            List<Integer> ll1=new ArrayList<>();
            l1.add(ll1);
            ll1.add(root.val);
            if(root.left!=null){
                level(root.left,l1,de+1);
            }
            if(root.right!=null){
                level(root.right,l1,de+1);
            }
            return l1;
        }
        else {
            List<Integer> ll1=l1.get(de);
            ll1.add(root.val);
            if(root.left!=null){
                level(root.left,l1,de+1);
            }
            if(root.right!=null){
                level(root.right,l1,de+1);
            }
            return l1;
        }
    }
}
