public class Robotsport {
    /*地上有一个 rows 行和 cols 列的方格。坐标从 [0,0] 到 [rows-1,cols-1] 。
    一个机器人从坐标 [0,0] 的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
    但是不能进入行坐标和列坐标的数位之和大于 threshold 的格子。 例如，当 threshold
    为 18 时，机器人能够进入方格   [35,37] ，因为 3+5+3+7 = 18。但是，它不能进入方格
    [35,38] ，因为 3+5+3+8 = 19 。请问该机器人能够达到多少个格子？


数据范围： 0 \le threshold \le 15 \0≤threshold≤15  ，1 \le rows,cols \le 100 \1≤rows,cols≤100

进阶：空间复杂度 O(nm) \O(nm)  ，时间复杂度 O(nm) \O(nm) */
    public static void main(String[] args) {
        int k=movingCount(1,2,3);
        System.out.println(k);
    }
    public static int movingCount(int threshold, int rows, int cols) {
        boolean[][] bb=new boolean[rows][cols];
        bb[0][0]=true;
        move(threshold,0,0,bb);
        int summ=0;
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(bb[i][j]){
                    summ++;
                }
            }
        }
        return summ;
    }
    public static boolean move(int threshold,int rows,int cols,boolean[][] bb){
        if(Canmove(threshold,rows,cols)){
            bb[rows][cols]=true;
            if(rows>0){
                if (bb[rows-1][cols]==false)
                move(threshold,rows-1,cols,bb);
            }
            if(cols>0){
                if (bb[rows][cols-1]==false)
                move(threshold,rows,cols-1,bb);
            }
            if(cols<bb[0].length-1){
                if(bb[rows][cols+1]==false)
                move(threshold,rows,cols+1,bb);
            }
            if(rows<bb.length-1){
                if(bb[rows+1][cols]==false)move(threshold,rows+1,cols,bb);
            }
            return true;
        }
        return false;
    }
    public static boolean Canmove(int threshold,int rows,int cols){
        int a=0,b=0;
        a+=rows/10+rows%10;
        b+=cols/10+cols%10;
        if(rows==100) {
            a=1;
        }
        if(cols==100){
            b=1;
        }
        return (a+b)<=threshold;
    }
}
