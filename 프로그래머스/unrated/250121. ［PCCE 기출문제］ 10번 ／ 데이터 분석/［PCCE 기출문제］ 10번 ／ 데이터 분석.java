import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int idx = 0;
        int key = 0;
        switch (ext) {
            case "date" :
                idx = 1;
                break;
            case "maximum" :
                idx = 2;
                break;
            case "remain" :
                idx = 3;
                break;
        }
        switch (sort_by) {
            case "date" :
                key = 1;
                break;
            case "maximum" :
                key = 2;
                break;
            case "remain" :
                key = 3;
                break;
        }
        HashMap<Integer, Object> map = new HashMap<>();
        for (int[] arr : data) {
            if (arr[idx] < val_ext) {
                map.put(arr[key], arr);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < answer.length; i++) {
            int[] a = (int[]) map.get(list.get(i));
            answer[i] = a;
        }
   
        return answer;
    }
}