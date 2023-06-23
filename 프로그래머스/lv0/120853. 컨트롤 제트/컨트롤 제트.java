class Solution {
    public int solution(String s) {
        char [] arr = new char[s.length()];
        
        StringBuilder str = new StringBuilder();
        
        int num = 0;
        int temp = 0;
        for (int i =0; i < s.length(); i++) {
            if (s.charAt(i) - '0' > -10 && s.charAt(i) - '0' < 10) {
                str.append(s.charAt(i));
                if (i == s.length()-1) {
                    String strS = str.toString();
                    temp = Integer.parseInt(strS);
                    num += temp;
                }
            }
            if (s.charAt(i) == ' '&& s.charAt(i-1) != 'Z') {
                String strS = str.toString();
                if (strS != "") {
                    temp = Integer.parseInt(strS);
                    num += temp;
                    str.setLength(0);
                }
            }
            if (s.charAt(i) == 'Z') {
                num -= temp;
            }
            
        }
        int answer = num;
        return answer;
    }
}