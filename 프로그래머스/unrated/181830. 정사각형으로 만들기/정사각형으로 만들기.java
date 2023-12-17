class Solution {
    public int[][] solution(int[][] arr) {
        int leng = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[leng][leng];
        if (arr.length > arr[0].length) {
            for (int i = 0; i < arr.length; i++) {
                int[] temp = new int[arr.length];
                System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
            }
        } else if (arr.length < arr[0].length) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
            }
        } else {
            answer = arr;
        }
        return answer;
    }
}