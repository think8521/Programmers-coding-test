class Solution {
    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length];
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < quiz.length; i++) {
            for (int j = 0; j < quiz[i].length(); j++) {
                if (quiz[i].charAt(j)-'0' > -1 && quiz[i].charAt(j)-'0' < 10 ||
                    (quiz[i].charAt(j) == '-' && quiz[i].charAt(j+1) != ' ')){
                    str.append(quiz[i].charAt(j));
                }
                if (quiz[i].charAt(j) == ' ' && 
                    (quiz[i].charAt(j+1) == '+' || quiz[i].charAt(j+1) == '-') && 
                    quiz[i].charAt(j+2) == ' ') {
                    num1 = Integer.parseInt(str.toString());
                    str.setLength(0);
                }
                if (quiz[i].charAt(j) == '='){
                    num2 = Integer.parseInt(str.toString());
                    str.setLength(0);
                }
                if (j == quiz[i].length() - 1){
                    num3 = Integer.parseInt(str.toString());
                    str.setLength(0);
                    
                    if (quiz[i].contains(" + ")) {
                        if (num1 + num2 == num3) {
                           answer[i] = "O";
                        } else {
                            answer[i] = "X";
                        }
                    }
                    if (quiz[i].contains(" - ")) {
                        if (num1 - num2 == num3) {
                           answer[i] = "O";
                        } else {
                            answer[i] = "X";
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}