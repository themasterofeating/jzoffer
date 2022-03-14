public class Hot48 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<=matrix.length/2;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
//                matrix[i][j]=matrix[j][n-i-1];
//                matrix[j][n-i-1]=matrix[n-i-1][n-1-j];
//                matrix[n-i-1][n-1-j]=matrix[n-1-j][i];
//                matrix[n-1-j][i]=temp;
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-i-1][n-1-j];
                matrix[n-i-1][n-1-j]=matrix[j][n-i-1];
                matrix[j][n-i-1]=temp;
            }
        }
    }
}
