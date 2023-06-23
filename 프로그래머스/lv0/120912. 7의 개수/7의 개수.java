class Solution {
    public int solution(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++ ) {
            str.append(array[i]);
        }
        String strS = str.toString();
        
        int answer = 0;
        for (int i = 0; i < strS.length(); i++ ) {
            if (strS.charAt(i) == '7') {
                answer++;
            }
        }
        return answer;
    }
}