class Solution {
    public int solution(int[] array, int height) {
        int tall = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i] > height) {
                tall++;
            }
        }
        int answer = tall;
        return answer;
    }
}