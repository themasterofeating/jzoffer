import java.util.Scanner;

public class Q1N1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[][] a=new int[n][k];
        for(int i=0;i<n;i++){
            for (int j=0;j<k;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int num=0;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int p=a[i][0]+a[j][0];
                boolean key=true;
                for(int l=1;l<k;l++){
                    if(a[i][l]+a[j][l]!=p){
                        key=false;
                        break;
                    }
                }
                if(key){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
