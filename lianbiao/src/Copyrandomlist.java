/*
* public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
* */


import java.util.ArrayList;
import java.util.List;

public class Copyrandomlist {

    public RandomListNode Clone(RandomListNode pHead) {
        List<RandomListNode> l1 = new ArrayList();
        l1.add(pHead);
        RandomListNode t1 = pHead;
        while (t1.next != null) {
            l1.add(t1.next);
            t1 = t1.next;
        }
        int[] loc = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            loc[i] = l1.indexOf(l1.get(i).random);
        }
        RandomListNode[] a = new RandomListNode[l1.size()];
        t1 = pHead;
        for (int i = 0; i < l1.size(); i++) {
            a[i] = new RandomListNode(t1.label);
            t1 = t1.next;
        }
        for (int i = 0; i < l1.size() - 1; i++) {
            a[i].next = a[i + 1];
            if (loc[i] >= 0) {
                a[i].random = a[loc[i]];
            }

        }
        return a[0];

    }
}
