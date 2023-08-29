class Solution {
    public int solution(String s) {
        int answer = 0;
        
        StringBuilder str = new StringBuilder();
        str.append(s);
        
        while (str.length() > 0) {
            int yes = 0;
            int no = 0;
            for (int i = 0; i < str.length(); i++) {
                char fst = str.charAt(0);
                if (str.charAt(i) == fst) {
                    yes++;
                } else {
                    no++;
                }
                if (yes == no || str.length()-1 == i) {
                str.delete(0, i+1);
                    answer++;
                    break;
                } 
                // else if (str.length() == 0) {
                //     answer++;
                // }
            }
        }
        
        return answer;
    }
}