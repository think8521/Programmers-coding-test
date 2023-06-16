class Solution {
    public int solution(int num, int k) {

        char[] arr = new char[String.valueOf(num).length()];
        for (int i=0; i<String.valueOf(num).length(); i++) {
            arr[i] = String.valueOf(num).charAt(i);
            if ((arr[i]-'0')==k) {
                return i+1;
            }
        }
        int answer = -1;
        return answer;
    }
}