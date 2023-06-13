class Solution {
    public String solution(String my_string) {
        char[] arr = new char[my_string.length()];
        String[] arrS = new String[my_string.length()];
        for (int i=0; i<my_string.length(); i++) {
            arr[i] = my_string.charAt(i);
            if (arr[i] <= 'Z') {
                arr[i] += ' ';
            } else {
                arr[i] -= ' ';
            }
            arrS[i] = String.valueOf(arr[i]);
        }
        String answer = "";
        answer = String.join("", arrS);
        
        return answer;
    }
}