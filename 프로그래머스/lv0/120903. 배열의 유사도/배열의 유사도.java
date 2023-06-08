class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        String[] s = new String[s1.length];
        for (int i = 0; i < s1.length; i++) {
            s[i] = s1[i];
            for (int a = 0; a < s2.length; a++) {
                if (s[i].equals(s2[a])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}