class Solution {
    public int solution(String my_string) {
        
        int answer = 0;
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) -'0' >=0 && my_string.charAt(i) - '0' < 10) {
                str.append(my_string.charAt(i));
                if (i == my_string.length()-1) {
                        answer += Integer.parseInt(str.toString());
                        return answer;
                }
            } else {
                String no = str.toString();
                if (!no.equals("")) {
                    answer += Integer.parseInt(no);
                    str.setLength(0);
                }
                
            }
        }
        
        
        return answer;
    }
}