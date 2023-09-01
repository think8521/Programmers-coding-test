import java.util.ArrayList;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayList<Integer> bucket = new ArrayList<>();
        
        // for (int i = 0; i < moves.length; i++) {
         for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move-1] != 0) {
                    bucket.add(board[j][move-1]);
                    board[j][move-1] = 0;
                    if (bucket.size() > 1) {
                        for (int k = 0; k < bucket.size(); k++) {
                            if (k > 0 && bucket.get(k) == bucket.get(k-1)) {
                                bucket.remove(k);
                                bucket.remove(k-1);
                                answer += 2;
                                k = 0;
                            }
                        }
                    }
        System.out.println(bucket.size());
                    break;
                }
            }
        }
        
        return answer;
    }
}