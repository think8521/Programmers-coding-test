class Solution {
    public String solution(String my_string, int[] indices) {
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = ' ';
        }
        String answer = String.valueOf(arr).replace(" ", "");
        return answer;
    }
}