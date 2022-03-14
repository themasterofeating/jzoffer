public class Hot79 {
    public static void main(String[] args) {
        String str="ABCESEEEFS";
        char[][] c1={{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        System.out.println(exist(c1,str));
    }
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        if (word.length() > m * n) return false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    String str=new String(word);
                    boolean[][] bb = new boolean[m][n];
                    bb[i][j] = true;
                    if (find(board,str.substring(1), i, j, bb)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean find(char[][] board, String word, int start1, int start2, boolean[][] bb) {
        if (word.length() == 0) {
            return true;
        }
        if (start1 > 0 && board[start1 - 1][start2] == word.charAt(0) && bb[start1 - 1][start2] == false) {
            if (word.length() == 1) {
                return true;
            } else {
                bb[start1 - 1][start2] = true;
                boolean[][] cc = new boolean[bb.length][bb[0].length];
                for(int i=0;i<bb.length;i++){
                    for(int j=0;j<bb[0].length;j++){
                        cc[i][j]=bb[i][j];
                    }
                }

                if (find(board, word.substring(1), start1 - 1, start2, cc)) {
                    return true;
                }
            }
        } if (start2 > 0 && board[start1][start2 - 1] == word.charAt(0) && bb[start1][start2 - 1] == false) {
            if (word.length() == 1) {
                return true;
            } else {
                bb[start1][start2 - 1] = true;
                boolean[][] cc = new boolean[bb.length][bb[0].length];
                for(int i=0;i<bb.length;i++){
                    for(int j=0;j<bb[0].length;j++){
                        cc[i][j]=bb[i][j];
                    }
                }
                if (find(board, word.substring(1), start1, start2 - 1, cc)) {
                    return true;
                }
            }
        } if (start2 <board[0].length-1 && board[start1][start2 + 1] == word.charAt(0) && bb[start1][start2 + 1] == false) {
            if (word.length() == 1) {
                return true;
            } else {
                bb[start1][start2 + 1] = true;
                boolean[][] cc = new boolean[bb.length][bb[0].length];
                for(int i=0;i<bb.length;i++){
                    for(int j=0;j<bb[0].length;j++){
                        cc[i][j]=bb[i][j];
                    }
                }
                if (find(board, word.substring(1), start1, start2 + 1, cc)) {
                    return true;
                }
            }
        } if (start1 <board.length-1 && board[start1 + 1][start2] == word.charAt(0) && bb[start1 + 1][start2] == false) {
            if (word.length() == 1) {
                return true;
            } else {
                bb[start1 + 1][start2] = true;
                boolean[][] cc = new boolean[bb.length][bb[0].length];
                for(int i=0;i<bb.length;i++){
                    for(int j=0;j<bb[0].length;j++){
                        cc[i][j]=bb[i][j];
                    }
                }
                if (find(board, word.substring(1), start1 + 1, start2, cc)) {
                    return true;
                }
            }

        }
        return false;
    }
}
