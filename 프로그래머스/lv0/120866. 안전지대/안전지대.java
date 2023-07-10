class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        
        // 1행 1열짜리 배열일 경우
        if (n == 1) {
            if (board[0][0] == 0) {
                answer = 1;
            }
            return answer;
        }
        // 1행 1번째가 폭탄
        if (board[0][0] == 1) {
            board[0][1] = (board[0][1] == 1) ? 1 : 2;
            board[1][0] = (board[1][0] == 1) ? 1 : 2;
            board[1][1] = (board[1][1] == 1) ? 1 : 2;
        }
        // 1행 마지막이 폭탄
        if (board[0][n-1] == 1) {
            board[0][n-2] = (board[0][n-2] == 1) ? 1 : 2;
            board[1][n-2] = (board[1][n-2] == 1) ? 1 : 2;
            board[1][n-1] = (board[1][n-1] == 1) ? 1 : 2;
        }
        // 마지막 행 1번째가 폭탄
        if (board[n-1][0] == 1) {
            board[n-2][0] = (board[n-2][0] == 1) ? 1 : 2;
            board[n-2][1] = (board[n-2][1] == 1) ? 1 : 2;
            board[n-1][1] = (board[n-1][1] == 1) ? 1 : 2;
        }
        // 마지막 행 마지막이 폭탄
        if (board[n-1][n-1] == 1) {
            board[n-2][n-2] = (board[n-2][n-2] == 1) ? 1 : 2;
            board[n-2][n-1] = (board[n-2][n-1] == 1) ? 1 : 2;
            board[n-1][n-2] = (board[n-1][n-2] == 1) ? 1 : 2;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    if (i > 0 && i < n-1 && j > 0 && j < n-1) {
                       board[i-1][j-1] = (board[i-1][j-1] == 1) ? 1 : 2;
                       board[i-1][j] = (board[i-1][j] == 1) ? 1 : 2;
                       board[i-1][j+1] = (board[i-1][j+1] == 1) ? 1 : 2;
                       board[i][j-1] = (board[i][j-1] == 1) ? 1 : 2;
                       board[i][j+1] = (board[i][j+1] == 1) ? 1 : 2;
                       board[i+1][j-1] = (board[i+1][j-1] == 1) ? 1 : 2;
                       board[i+1][j] = (board[i+1][j] == 1) ? 1 : 2;
                       board[i+1][j+1] = (board[i+1][j+1] == 1) ? 1 : 2;
                    }
                    // 첫 행 처음과 끝을 제외한 나머지가 폭탄일 경우
                    if (i == 0 && j > 0 && j < n-1) {
                        board[i][j-1] = (board[i][j-1] == 1) ? 1 : 2;
                        board[i][j+1] = (board[i][j+1] == 1) ? 1 : 2;
                        board[i+1][j-1] = (board[i+1][j-1] == 1) ? 1 : 2;
                        board[i+1][j] = (board[i+1][j] == 1) ? 1 : 2;
                        board[i+1][j+1] = (board[i+1][j+1] == 1) ? 1 : 2;
                    }
                    // 첫 열 처음과 끝을 제외한 나머지가 폭탄일 경우
                    if (i > 0 && i < n-1 && j == 0) {
                        board[i-1][j] = (board[i-1][j] == 1) ? 1 : 2;
                        board[i-1][j+1] = (board[i-1][j+1] == 1) ? 1 : 2;
                        board[i][j+1] = (board[i][j+1] == 1) ? 1 : 2;
                        board[i+1][j] = (board[i+1][j] == 1) ? 1 : 2;
                        board[i+1][j+1] = (board[i+1][j+1] == 1) ? 1 : 2;
                    }
                    // 마지막 열 처음과 끝을 제외한 나머지가 폭탄일 경우
                    if (i > 0 && i < n-1 && j == n-1) {
                       board[i-1][j-1] = (board[i-1][j-1] == 1) ? 1 : 2;
                       board[i-1][j] = (board[i-1][j] == 1) ? 1 : 2;
                       board[i][j-1] = (board[i][j-1] == 1) ? 1 : 2;
                       board[i+1][j-1] = (board[i+1][j-1] == 1) ? 1 : 2;
                       board[i+1][j] = (board[i+1][j] == 1) ? 1 : 2;
                    }
                    // 마지막 행 처음과 끝을 제외한 나머지가 폭탄일 경우
                    if (i == n-1 && j > 0 && j < n-1) {
                        board[i-1][j-1] = (board[i-1][j-1] == 1) ? 1 : 2;
                       board[i-1][j] = (board[i-1][j] == 1) ? 1 : 2;
                       board[i-1][j+1] = (board[i-1][j+1] == 1) ? 1 : 2;
                       board[i][j-1] = (board[i][j-1] == 1) ? 1 : 2;
                       board[i][j+1] = (board[i][j+1] == 1) ? 1 : 2;
                    }
                }
                
                
            }
        }
        // 최종 안전지대 카운트
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
         }
        System.out.println(answer);
        return answer;
    }
}