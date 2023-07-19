class Solution {
    public int solution(int n) {
        int num = n;
        StringBuilder str = new StringBuilder();
        str.append(num%3);
        
        while (num >= 3) {
            num = num/3;
            str.append(num%3);
        }
        // System.out.println(str.toString());
        String rev = str.toString();
        int answer = 0;
        
        for (int i = 0; i < rev.length(); i++) {
            int temp = rev.charAt(i)-'0';
            for (int j = 1; j <= rev.length() - (i+1); j++) {
                temp = temp * 3;
            }
                answer += temp;
        }
        return answer;
    }
}