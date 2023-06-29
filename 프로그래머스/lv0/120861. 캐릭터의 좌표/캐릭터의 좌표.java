class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int[] lo = {0, 0};
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up") && (board[1]-1)/2 > lo[1]) {
                lo[1]++;
            } else if (keyinput[i].equals("down") && (-board[1]+1)/2 < lo[1]) {
                lo[1]--;
            } else if (keyinput[i].equals("left") && (-board[0]+1)/2 < lo[0]) {
                lo[0]--;
            } else if (keyinput[i].equals("right") && (board[0]-1)/2 > lo[0]) {
                lo[0]++;
            }
        }
        
        
        
        int[] answer = lo;
        return answer;
    }
}