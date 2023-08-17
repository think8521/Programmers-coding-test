import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == s1[i%5]) {
                count1 ++;
            }
            if (answers[i] == s2[i%8]) {
                count2 ++;
            }
            if (answers[i] == s3[i%10]) {
                count3 ++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        
        if (count1 >= count2 && count1 >= count3) {
            arr.add(1);    
        }
        if (count2 >= count1 && count2 >= count3) {
            arr.add(2);    
        }
        if (count3 >= count1 && count3 >= count2) {
            arr.add(3);    
        }
        
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}