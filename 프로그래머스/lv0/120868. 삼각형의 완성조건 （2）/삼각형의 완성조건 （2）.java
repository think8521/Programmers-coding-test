class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        if (sides[0] == sides[1]) {
            
        }
        
        int min = Math.min(sides[0], sides[1]) * 2 - Math.max(sides[0], sides[1]) -1;
        int mid = Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1]) + 1;
        int max = Math.min(sides[0], sides[1]) -1;
        answer = min+mid+max;
        return answer;
    }
}