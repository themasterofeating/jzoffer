public class Hot85 {
    public int maximalRectangle(char[][] matrix) {
        int a=0;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int l=Integer.MAX_VALUE;
                for(int x=i;x<m;x++){
                    for(int y=j;y<n;y++){
                        if(matrix[x][y]=='0'){
                            l=Math.min(l,y-j);
                            a=Math.max(a,l*(x-i+1));
                            break;
                        }else if(y==n-1){
                            l=Math.min(l,y-j+1);
                            a=Math.max(a,l*(x-i+1));
                            break;
                        }
                        if(y-j==l){
                            a=Math.max(a,l*(x-i+1));
                            break;
                        }
                    }
                }
            }
        }
        return a;
    }
}
