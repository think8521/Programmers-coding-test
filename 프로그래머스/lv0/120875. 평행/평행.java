class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double a = 0;
        double b = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        if (i != j && i != k && i != l && j != k && j != l && k != l) {
                            a = ((double) dots[i][1] - dots[j][1]) / ((double) dots[i][0] - dots[j][0]);
                            b = ((double) dots[k][1] - dots[l][1]) / ((double) dots[k][0] - dots[l][0]);
                            if (a == b) {
                                System.out.println(i+","+j+","+k+","+l);
                                answer = 1;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}