import java.util.ArrayList;
import java.util.List;

public class Hot142 {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> l1=new ArrayList<>();
        ListNode ln1=head;
        while (true){
            if(ln1==null){
                return null;
            }
            if(l1.contains(ln1)){
                return ln1;
            }else {
                l1.add(ln1);
                ln1=ln1.next;
            }
        }
    }
}
