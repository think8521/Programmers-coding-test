class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int state = 0;
        int col = 0;
        int row = 0;
        for (int i = 1; i <= n*n; i++) {
            answer[col][row] = i;
            switch (state) {
                case 0:
                    if (row < n-1 && answer[col][row+1] == 0) {
                        row++;
                    } else {
                        state = 1;
                        col++;
                    }
                    break;
                case 1 :
                    if (col < n-1 && answer[col+1][row] == 0) {
                        col++;
                    } else {
                        state = 2;
                        row--;
                    }
                    break;
                case 2 :
                    if (row > 0 && answer[col][row-1] == 0) {
                        row--;
                    } else {
                        state = 3;
                        col--;
                    }
                    break;
                case 3 :
                    if (col > 0 && answer[col-1][row] == 0) {
                        col--;
                    } else {
                        state = 0;
                        row++;
                    }
                    break;
                    
            }
        }
        return answer;
    }
}