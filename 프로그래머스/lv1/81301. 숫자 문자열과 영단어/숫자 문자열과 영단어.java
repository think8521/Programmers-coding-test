class Solution {
    public int solution(String s) {
        
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String str = s;
        for (int i = 0; i < 10; i++) {
            if (s.contains(num[i])) {
                str = str.replace(num[i], String.valueOf(i));
            }
        }
        
        int answer = Integer.valueOf(str);
        
        return answer;
    }
}