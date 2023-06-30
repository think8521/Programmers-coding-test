class Solution {
    public int solution(int chicken) {
        
        int cop = 0;
        while (chicken >= 10) {
            chicken = chicken-10;
            cop++;
            chicken++;
        }
        
        
        int answer = cop;
        
        
        return answer;
    }
}