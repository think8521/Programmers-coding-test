class Solution {
    public String solution(String code) {
        int mode = 0;
        char[] arr = code.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (arr[i] != '1') {
                    if (i%2 == 0) {
                        str.append(arr[i]);
                    }
                } else {
                    mode = 1;
                }
            } else {
                if (arr[i] != '1') {
                    if (i%2 == 1) {
                        str.append(arr[i]);
                    }
                } else {
                    mode = 0;
                }
            }
        }
        String answer = (str.length() == 0) ? "EMPTY" : str.toString();
        return answer;
    }
}