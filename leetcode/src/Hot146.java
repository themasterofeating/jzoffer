import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hot146 {
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(2,11);
        System.out.println(ll.get(2));
    }
    int capacity;

    List<Integer> key = new ArrayList<>();

    List<Integer> value = new ArrayList<>();

    public Hot146(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (this.key.contains(key)) {
            int k1 = key;
            int v1 = this.value.get(this.key.indexOf(key));
            int kk = this.key.indexOf(key);
            this.key.remove(kk);
            this.key.add(key);
            this.value.remove(kk);
            this.value.add(v1);
            return v1;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (this.key.contains(key)) {
            int p=this.key.indexOf(key);
            this.value.remove(p);
            this.key.remove(p);
            this.value.add(value);
            this.key.add(key);

        } else {
            if (this.key.size() < capacity) {
                this.key.add(key);
                this.value.add(value);
            } else {
                this.key.remove(0);
                this.value.remove(0);
                this.key.add(key);
                this.value.add(value);
            }
        }
    }
}
