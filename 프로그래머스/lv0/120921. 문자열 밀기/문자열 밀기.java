class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        if (A.equals(B)) {
            answer = 0;
            return answer;
        }
        
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < B.length(); i++) {
            str.append(A.charAt(B.length()-1));
            for (int j = 0; j < B.length()-1; j++) {
                str.append(A.charAt(j));
            }
            A = str.toString();
            if (A.equals(B)) {
                answer = i+1;
                return answer;
            }
            str.setLength(0);
            System.out.println(A);
        }
        
        return answer;
    }
}