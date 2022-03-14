import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1N2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<int[]> ll=Bg(n,k);
        for(int[] arr:ll){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println("");
        }
    }
    static ArrayList<int[]> Bg(int n,int k){
        if(k>1){
            ArrayList<int[]> l0=Bg(n,k-1);
            ArrayList<int[]> l1=new ArrayList<>();
            for(int i=0;i<l0.size();i++){
                int[] x=l0.get(i);
                int y=x[k-2];
                for(int l=y+1;l<=n;l++){
                    int[] aa=new int[k];
                    for(int z=0;z<k-1;z++){
                        aa[z]=x[z];
                    }
                    aa[k-1]=l;
                    l1.add(aa);
                }
            }
            return l1;
        }else {
            ArrayList<int[]> l1=new ArrayList<>();
            for(int i=1;i<=n;i++){
                int[] a={i};
                l1.add(a);
            }
            return l1;
        }
    }
}
