public class zhengze {
    public static void main(String[] args) {
        System.out.println(match("a", "a*"));
    }

    //    请实现一个函数用来匹配包括'.'和'*'的正则表达式。
//    1.模式中的字符'.'表示任意一个字符
//    2.模式中的字符'*'表示它前面的字符可以出现任意次（包含0次）。
//    在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*a
//    c*a"匹配，但是与"aa.a"和"ab*a"均不匹配
    public static boolean match(String str, String pattern) {
        char[] c1 = str.toCharArray();
        char[] c2 = pattern.toCharArray();
        boolean[][] dp = new boolean[c2.length + 1][c1.length + 1];
        dp[0][0] = true;
        char key = '0';
        for (int i = 1; i < c2.length; i++) {
            for (int j = 0; j < c1.length + 1; j++) {
                if (j == 0) {
                    if (c2[i - 1] == '*') {
                        dp[i][j] = dp[i - 2][j];
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if ( c2[i - 1] == '*') {
                        if (c1[j - 1] == key || key == '.') {
                            dp[i][j] = dp[i - 2][j - 1] || dp[i][j - 1];
                        } else {
                            dp[i][j] = false;
                        }
                    } else if (c2[i - 1] == '.') {
                        dp[i][j] = dp[Math.max(0, i - 1)][Math.max(0, j - 1)];
                    } else {
                        if (c2[i] == '*') {
                            dp[i][j] = false;
                            key = c2[i - 1];
                        } else {
                            if (c1[j - 1] == c2[i - 1]) {
                                dp[i][j] = dp[Math.max(i - 1, 0)][Math.max(j - 1, 0)];
                            } else {
                                dp[i][j] = false;
                            }
                        }
                    }
                }

            }
        }
        int i = c2.length;
        for (int j = 1; j < c1.length + 1; j++) {
            if (c2[i - 1] == '*') {
                if (c1[j - 1] == key) {
                    dp[i][j] = dp[i - 2][j - 1] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            } else if (c2[i - 1] == '.') {
                dp[i][j] = dp[Math.max(0, i - 1)][Math.max(0, j - 1)];
            } else {
                if (c1[j - 1] == c2[i - 1]) {
                    dp[i][j] = dp[Math.max(i - 1, 0)][Math.max(j - 1, 0)];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[c2.length][c1.length];
    }
}
