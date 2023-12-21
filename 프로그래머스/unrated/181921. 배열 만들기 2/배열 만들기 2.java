import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <=r; i++) {
            if (String.valueOf(i).matches("[50]+")) {
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return (answer.length>0) ? answer : new int[]{-1};
    }
}