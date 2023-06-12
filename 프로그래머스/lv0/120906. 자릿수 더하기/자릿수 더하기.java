class Solution {
    public int solution(int n) {
        String nstring = Integer.toString(n);
        int answer = 0;
        
        int[] narr = new int[nstring.length()];
        for (int i=0; i < nstring.length(); i++) {
            narr[i] = nstring.charAt(i) - '0';
            answer += narr[i];
        }
       
        
        return answer;
    }
}