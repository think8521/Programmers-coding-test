class Solution {
    public int solution(int i, int j, int k) {
        
        StringBuilder arrS = new StringBuilder();
        for (; i<j+1; i++) {
            arrS.append(i);
        }
        
        
        int answer = 0;
        for (int l=0; l<arrS.length(); l++) {
            if (arrS.charAt(l) == (char)k + '0') {
                answer++;
            }
        }
        
        
        
        return answer;
    }
}