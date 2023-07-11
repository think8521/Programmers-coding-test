import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                    if (i != j && Math.min(lines[i][1], lines[j][1]) > Math.max(lines[i][0], lines[j][0])) {
                        answer += Math.min(lines[i][1], lines[j][1]) - Math.max(lines[j][0], lines[i][0]);
                    }
                for (int k = 0; k < 3; k++) {
                    if (i != j && j != k && k != i) {
                        if (lines[k][1] > lines[i][0] && lines[k][1] > lines[j][0] &&
                           lines[k][1] <= lines[i][1] && lines[k][1] <= lines[j][1] ) {
                            a = lines[k][1] - Math.max(lines[i][0], lines[j][0]);
                        }
                    }
                }
            }
        }
        System.out.println(answer);
        System.out.println(a);
        answer = answer - 2*a;
        return answer;
    }
}