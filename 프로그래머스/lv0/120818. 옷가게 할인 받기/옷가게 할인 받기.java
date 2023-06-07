class Solution {
    public int solution(int price) {
        float pricef = (float)price;
        if (price >= 100000 && price < 300000) {
            pricef = pricef * 0.95f;
        } else if (price >= 300000 && price < 500000) {
            pricef = pricef * 0.9f;
        } else if (price >= 500000) {
            pricef = pricef * 0.8f;
        }
        
        int answer = (int) pricef;
        return answer;
    }
}