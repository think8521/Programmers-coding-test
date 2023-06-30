class Solution {
    public int solution(int[][] dots) {
        int max = -256;
        int min = 256;
        
        for (int i = 0; i < 4; i++) {
            if (max <= dots[i][0]) {
                max = dots[i][0];
            }
            if (min >=dots[i][0]) {
                min = dots[i][0];
            }
        }
        
        int length = Math.abs(max - min);
        
        max = -256;
        min = 256;
        
        for (int i = 0; i < 4; i++) {
            if (max <= dots[i][1]) {
                max = dots[i][1];
            }
            if (min >=dots[i][1]) {
                min = dots[i][1];
            }
        }
        
        int hight = Math.abs(max - min);
        
        
        int answer = length * hight;
        
        
        System.out.println(answer);
        return answer;
    }
}