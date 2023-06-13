class Solution {
    public String solution(String cipher, int code) {
        String[] arr = new String[cipher.length()];
        // String[] result = new String[cipher.length()/code];
        String answer = "";
        for (int i=0; i<cipher.length(); i++) {
            arr[i] = String.valueOf(cipher.charAt(i));
            if ((i+1)%code == 0) {
                answer += arr[i];
            }
        }
        return answer;
    }
}