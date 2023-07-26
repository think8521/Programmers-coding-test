import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        
        int[] length = new int[sizes.length];
        int[] hight = new int[sizes.length];
        
        for (int i = 0; i < sizes.length; i++) {
            length[i] = Math.max(sizes[i][0], sizes[i][1]);
            hight[i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        Arrays.sort(length);
        Arrays.sort(hight);
        
        int answer = length[sizes.length-1] * hight[sizes.length-1];
        
        return answer;
    }
}