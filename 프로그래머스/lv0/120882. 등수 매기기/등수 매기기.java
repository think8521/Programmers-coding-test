import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] aver = new int[score.length];
        int[] ind = new int[score.length];
        int[] answer = new int[score.length];
        if (score.length == 1) {
            answer[0] = 1;
            return answer;
        }
        
        for (int i = 0; i < score.length; i++) {
            int average = score[i][0] + score[i][1];
            aver[i] = average;
            ind[i] = average;
            
        }
        
        for (int i = 0; i < aver.length; i++) {
            for (int j = i; j < aver.length; j++) {
                if (aver[i] <= aver[j]) {
                    int temp = aver[i];
                    aver[i] = aver[j];
                    aver[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < aver.length; j++) {
                
                if (j == 0 && ind[i] == aver[j]) {
                    answer[i] = j+1;
                }
                if (j != 0 && ind[i] == aver[j] && aver[j] != aver[j-1]) {
                    answer[i] = j+1;
                }
            }
        }
        return answer;
    }
}

// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[][] score) {
//         int[] aver = new int[score.length];
//         int[] answer = new int[score.length];
        
//         for (int i = 0; i < score.length; i++) {
//             aver[i] = (score[i][0] + score[i][1]) / 2;
//         }
        
//         int[] sortedAver = Arrays.copyOf(aver, aver.length);
//         Arrays.sort(sortedAver);
        
//         for (int i = 0; i < answer.length; i++) {
//             int rank = Arrays.binarySearch(sortedAver, aver[i]);
//             answer[i] = answer.length - rank;
//         }
        
//         return answer;
//     }
// }