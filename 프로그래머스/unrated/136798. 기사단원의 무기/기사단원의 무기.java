import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        int[] numbers = new int[number];
        
        for (int i = 0; i < number; i++) {
            numbers[i] = i+1;
        }
        
        for (int num : numbers) {
            int ys = 0;
            for (int i = 1; i*i <= num; i++) {
                if (num % i == 0) {
                    int temp = num/i;
                    if (temp == i) {
                        ys++;
                    } else {
                        ys += 2;
                    }
                }
            }
            if (ys > limit) {
                ys = power;
            }
            list.add(ys);
        }
        
        for (int steel : list) {
            answer += steel;
        }
        return answer;
    }
}