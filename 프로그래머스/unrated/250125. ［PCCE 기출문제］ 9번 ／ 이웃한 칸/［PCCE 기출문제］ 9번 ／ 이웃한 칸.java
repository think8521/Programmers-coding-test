class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String a = board[h][w];
        if (board[Math.max(0, h-1)][w].equals(a) && board[Math.max(0, h-1)][w] != a) answer++;
        if (board[h][Math.max(0, w-1)].equals(a) && board[h][Math.max(0, w-1)] != a) answer++;
        if (board[h][Math.min(board.length-1, w+1)].equals(a) && board[h][Math.min(board.length-1, w+1)] != a) answer++;
        if (board[Math.min(board.length-1, h+1)][w].equals(a) && board[Math.min(board.length-1, h+1)][w] != a) answer++;
        
        return answer;
    }
}