class Solution {
    public String solution(String polynomial) {
        
        int countx = 0;
        int countn = 0;
        // polynomial = polynomial.replace(" ", "");
        
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < polynomial.length(); i++) {
            if (polynomial.charAt(i) != ' ') {
                str.append(polynomial.charAt(i));
            }
        }
        polynomial = str.toString();
        str.setLength(0);
        
        for (int i = 0; i < polynomial.length(); i++) {
            if (polynomial.charAt(i) != '+' && polynomial.charAt(i) != 'x') {
                str.append(polynomial.charAt(i));
                if (i == polynomial.length()-1) {
                    String num = str.toString();
                    countn += Integer.parseInt(num);
                }
            } 
            if (polynomial.charAt(i) == '+') {
                String num = str.toString();
                if (num.length() != 0) {
                    countn += Integer.parseInt(num);
                    str.setLength(0);
                }
            } 
            if (polynomial.charAt(i) == 'x') {
                String num = str.toString();
                if (num.length() == 0) {
                    num = "1";
                }
                countx += Integer.parseInt(num);
                str.setLength(0);
            }
        }
        
        if (countn != 0 && countx > 1) {
            String answer = countx + "x + " + countn;
            return answer;
        } else if (countn == 0 && countx > 1) {
            String answer = countx + "x";
            return answer;
        } else if (countn != 0 && countx ==0) {
            String answer = String.valueOf(countn);
            return answer;
        } else if (countx == 1 && countn != 0) {
            String answer = "x + " + countn;
            return answer;
        } else if (countx == 1 && countn == 0) {
            String answer = "x";
            return answer;
        } else {
        String answer = polynomial;
        return answer;
        }
    }
}