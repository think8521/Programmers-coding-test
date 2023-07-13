class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int county = 0;
        int countp = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                countp++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                county++;
            }
        }
        
        if (county != countp) {
            answer = false;
        }

        return answer;
    }
}