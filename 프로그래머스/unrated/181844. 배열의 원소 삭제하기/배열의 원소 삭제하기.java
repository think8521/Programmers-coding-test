import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr2.add(arr[i]);
            for (int a : delete_list) {
                if (arr[i] == a) {
                    arr2.remove(arr2.size()-1);
                }
            }
        }
        int[] answer = new int[arr2.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) arr2.get(i);
        }
        // Integer[] arr3 = arr2.toArray(new Integer[0]);
        // for (int i = 0; i < arr2.size(); i++) {
        //     answer[i] = arr2.get(i);
        // }
        
        
        return answer;
    }
}