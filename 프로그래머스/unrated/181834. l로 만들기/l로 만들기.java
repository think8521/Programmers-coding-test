class Solution {
    public String solution(String myString) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) < 'l') {
                str.append('l');
            } else {
                str.append(myString.charAt(i));
            }
        }
        String answer = str.toString();
        return answer;
    }
}