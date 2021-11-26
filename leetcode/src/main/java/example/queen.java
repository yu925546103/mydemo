package example;

import org.junit.Test;

import java.util.Arrays;

/**
 * 八皇后问题 找出一种方案
 */
public class queen {
    public static int MAX_NUM = 8;
    int[][] queen = new int[MAX_NUM][MAX_NUM];
    @Test
    public void test() {
        back_tracking(0);
        for (int i=0;i<MAX_NUM;i++) {
            System.out.println("");
            for (int j=0;j<MAX_NUM;j++) {
                System.out.print(queen[i][j]+" ");
            }
        }
    }
    private boolean check(int row, int column) {
        for (int i = 0; i < row; i++) {
            //检查纵向
            if (queen[i][column] == 1) {
                return false;
            }
            //检查左斜线
            if ((column - row + i) >= 0 && 1 == queen[i][column - row + i]) {
                return false;
            }
            //检查右斜线
            if ((column + row - i) < MAX_NUM && 1 == queen[i][column + row - i]) {
                return false;
            }
        }
        return true;
    }

    boolean back_tracking(int row) {
        if (row == MAX_NUM) {
            return true;
        }
        for (int i = 0;i < MAX_NUM;i++) {
             //清空行
            for (int colunm=0;colunm < MAX_NUM;colunm++) {
                queen[row][colunm] = 0;
            }
            if (check(row,i)) {
                queen[row][i] = 1;
                if(back_tracking(row+1)){
                    return true;
                }
            }
        }
        return false;
    }
}
