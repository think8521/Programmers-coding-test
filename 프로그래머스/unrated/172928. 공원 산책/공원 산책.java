class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int H = 0;
        int W = 0;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    H = i;
                    W = j;
                }
            }
        }
        
        for (String route : routes) {
            int plus = route.charAt(2) - '0';
            char go = route.charAt(0);
            int canigo = 0;
            switch (go)
            {
                case 'E':
                    if (W + plus < park[0].length()) {
                        for (int i = 0; i <= plus; i++) {
                            if (park[H].charAt(W + i) == 'X') {
                                canigo = 1;
                                break;
                            }
                        }
                        if (canigo == 0) {
                            W += plus;
                        }
                    }
                    break;
                case 'W':
                    if (W - plus > -1) {
                        for (int i = 0; i <= plus; i++) {
                            if (park[H].charAt(W - i) == 'X') {
                                canigo = 1;
                                break;
                            }
                        }
                        if (canigo == 0) {
                            W -= plus;
                        }
                    }
                    break;
                case 'S':
                    if (H + plus < park.length) {
                        for (int i = 0; i <= plus; i++) {
                            if (park[H + i].charAt(W) == 'X') {
                                canigo = 1;
                                break;
                            }
                        }
                        if (canigo == 0) {
                            H += plus;
                        }
                    }
                    break;
                case 'N':
                    // if (H - plus > -1 && park[H - plus].charAt(W) != 'X') {
                    //     H -= plus;
                    // }
                    if (H - plus > -1) {
                        for (int i = 0; i <= plus; i++) {
                            if (park[H - i].charAt(W) == 'X') {
                                canigo = 1;
                                break;
                            }
                        }
                        if (canigo == 0) {
                            H -= plus;
                        }
                    }
                    break;
            }
        }
        
        
        
        int[] answer = {H, W};
        return answer;
    }
}