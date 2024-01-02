import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int leng = A.length;
        int answer = 0;
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());
        // Integer[] a_1 = Arrays.stream(A).boxed().sorted().toArray(Integer[]::new);
        // Arrays.sort(A);
        // Integer[] b = Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        
        for (int i = 0; i < leng; i++) {
            a.add(A[i]);
            b.add(B[i]);
        }
        
        for (int i = 0; i < leng; i++) {
            answer += a.poll() * b.poll();
        }

        return answer;
    }
}