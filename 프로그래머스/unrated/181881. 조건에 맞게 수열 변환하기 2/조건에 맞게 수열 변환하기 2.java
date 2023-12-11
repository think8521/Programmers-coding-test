import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = arr.clone();
            arr2 = change(arr2);
        while (true) {
            if (Arrays.equals(arr, arr2)) {
                break;
            }
            arr = change(arr);
            arr2 = change(arr2);
            answer++;
        }
        return answer;
    }
    
    public int[] change(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i]*2+1;
            }
        }
        return arr;
    }
}