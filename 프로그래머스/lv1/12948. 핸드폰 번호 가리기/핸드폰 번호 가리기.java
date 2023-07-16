class Solution {
    public String solution(String phone_number) {
        StringBuilder str = new StringBuilder();
        for (int i =0; i < phone_number.length(); i++) {
            if (i < phone_number.length()-4) {
                str.append("*");
            } else {
                str.append(phone_number.charAt(i));
            }
        }
        
        String answer = str.toString();
        return answer;
    }
}