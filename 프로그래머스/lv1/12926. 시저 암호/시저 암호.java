class Solution {
    public String solution(String s, int n) {
        
        char[] arr = s.toCharArray();
        String answer = "";
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                char temp = arr[i];
                arr[i] = (char) (arr[i] + n);
                if (Integer.valueOf(temp) < 91) {
                    if (Integer.valueOf(arr[i]) > 90) {
                        arr[i] = (char) (arr[i] - 26);
                    }
                } else {
                    if (Integer.valueOf(arr[i]) > 122) {
                        arr[i] = (char) (arr[i] - 26);
                    }
                }
            }
            answer += arr[i];
        }
        
        return answer;
    }
}