class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int winCount = 0;
        int bro = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                bro++;
            }
            for (int num : win_nums) {
                if (lotto == num) {
                    winCount++;
                }
            }
        }
        
        int[] answer = new int[2];
        
        int winMax = winCount + bro;
        int winMin = winCount;
        
        if (winMax == 6) {
            answer[0] = 1;
        } else if (winMax == 5) {
            answer[0] = 2;
        } else if (winMax == 4) {
            answer[0] = 3;
        } else if (winMax == 3) {
            answer[0] = 4;
        } else if (winMax == 2) {
            answer[0] = 5;
        } else if (winMax < 2) {
            answer[0] = 6;
        }
        
        if (winMin == 6) {
            answer[1] = 1;
        } else if (winMin == 5) {
            answer[1] = 2;
        } else if (winMin == 4) {
            answer[1] = 3;
        } else if (winMin == 3) {
            answer[1] = 4;
        } else if (winMin == 2) {
            answer[1] = 5;
        } else if (winMin < 2) {
            answer[1] = 6;
        }
        
        
        return answer;
    }
}