class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[][] pad = {{1,2,3},
                       {4,5,6,},
                       {7,8,9},
                       {-1,0,-2}};
        
        int Ltemp = -1;
        int Rtemp = -2;
        int[] Lpos = {3, 0};
        int[] Rpos = {3, 2};
        int[] Npos = {0, 0};
        
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                Ltemp = numbers[i];
                answer += "L";
                    
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                Rtemp = numbers[i];
                answer += "R";
                    
            } else if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (Ltemp == pad[j][k]) {
                            Lpos[0] = j;
                            Lpos[1] = k;
                        }
                        if (Rtemp == pad[j][k]) {
                            Rpos[0] = j;
                            Rpos[1] = k;
                        }
                    }
                }
                
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (numbers[i] == pad[j][k]) {
                            Npos[0] = j;
                            Npos[1] = k;
                        }
                    }
                }
                if (Math.abs(Npos[0] - Lpos[0]) + Math.abs(Npos[1] - Lpos[1]) < 
                    Math.abs(Npos[0] - Rpos[0]) + Math.abs(Npos[1] - Rpos[1])) {
                    Ltemp = numbers[i];
                    Lpos[0] = Npos[0];
                    Lpos[1] = Npos[1];
                    answer += "L";
                } else if (Math.abs(Npos[0] - Lpos[0]) + Math.abs(Npos[1] - Lpos[1]) > 
                    Math.abs(Npos[0] - Rpos[0]) + Math.abs(Npos[1] - Rpos[1])) {
                    Rtemp = numbers[i];
                    Rpos[0] = Npos[0];
                    Rpos[1] = Npos[1];
                    answer += "R";
                } else {
                    if (hand.equals("left")) {
                        Ltemp = numbers[i];
                        Lpos[0] = Npos[0];
                        Lpos[1] = Npos[1];
                        answer += "L";
                    } else if (hand.equals("right")) {
                        Rtemp = numbers[i];
                        Rpos[0] = Npos[0];
                        Rpos[1] = Npos[1];
                        answer += "R";
                    }
                }
            }
        }
        
        
        
        
        return answer;
    }
}