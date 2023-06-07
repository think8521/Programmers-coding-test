class Solution {
    public int solution(int slice, int n) {
        int plate = 0;
        if (n <= slice) {
            plate = 1;
        } else if (n > slice && n%slice > 0) {
            plate = n/slice + 1;
        } else {
            plate = n/slice;
        }
        int answer = plate;
        return answer;
    }
}