class Solution {
    public long solution(String numbers) {
        
        
        if (numbers.contains("one")) {
            numbers = numbers.replace("one", "1");
        }
        if (numbers.contains("two")) {
            numbers = numbers.replace("two", "2");
        }
        if (numbers.contains("three")) {
            numbers = numbers.replace("three", "3");
        }
        if (numbers.contains("four")) {
            numbers = numbers.replace("four", "4");
        }
        if (numbers.contains("five")) {
            numbers = numbers.replace("five", "5");
        }
        if (numbers.contains("six")) {
            numbers = numbers.replace("six", "6");
        }
        if (numbers.contains("seven")) {
            numbers = numbers.replace("seven", "7");
        }
        if (numbers.contains("eight")) {
            numbers = numbers.replace("eight", "8");
        }
        if (numbers.contains("nine")) {
            numbers = numbers.replace("nine", "9");
        }
        if (numbers.contains("zero")) {
            numbers = numbers.replace("zero", "0");
        }
        StringBuffer num = new StringBuffer();
        num.append(numbers);
        while (num.charAt(0) != '0') {
            if (num.charAt(0) != '0') {
                break;
            } else if (num.charAt(0) == '0') {
                num.deleteCharAt(0);
            }
        }
        
        System.out.println(num.toString());
        
        
        long answer = Long.parseLong(num.toString());
        return answer;
    }
}