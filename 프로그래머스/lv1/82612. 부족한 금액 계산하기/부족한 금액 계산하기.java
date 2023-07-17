class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long temp = 0;
        int moneyorg = money;
        
        for (int i = 1; i <= count; i++) {
            temp += (long)price*i;
            if (money - price*i > 0) {
                money -= (long) price*i;
                answer = money;
            } else {
                answer = temp - moneyorg;
            }
        }
        if (moneyorg - temp > 0) {
            return 0;
        }
        
        return answer;
    }
}