class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String menu : order) {
            if (menu.startsWith("americano") || menu.endsWith("americano") || menu.equals("anything")) {
                answer += 4500;
            } else {
                answer += 5000;    
            }
            System.out.println(answer);
        }
        return answer;
    }
}