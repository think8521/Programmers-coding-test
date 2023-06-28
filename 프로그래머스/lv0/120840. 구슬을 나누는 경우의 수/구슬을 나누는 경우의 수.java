class Solution {
    public int solution(double balls, double share) {
        
        double dif = balls - share;
        double answer = balls;
        if (dif == 0) {
            answer = 1;
            return (int) answer;
        }
        
        for (int i = 1; i < dif; i++) {
            answer *= balls-i;
            answer /= i + 1;
        }
        
        return (int) answer;
        
        
//         double answer = 1;
        
//         double dif = balls - share;
//         if (dif == 0) {
//             answer = 1;
//             return (int) answer;
//         }
//         Factorial factorial = new Factorial();
        
        
//         answer = factorial.F(balls)) / (factorial.F(share) * factorial.F(dif);
//         return (int) answer;
//     }
        
        
    
    
//         static class Factorial{
//             public double F(double n) {
//                 if (n == 1) {
//                     return 1;
//                 }
                
//             return F(n-1) * n;
            // }
        }
}