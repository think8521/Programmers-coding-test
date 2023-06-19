class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        
        for (int i=0; i < array.length; i++) {
            int abs = Math.abs(array[i] - n);
            if (min > abs) {
                min = abs;
                result = array[i];
                
            } else if(min == abs){
                result = Math.min(result, array[i]);
            }
        }
        
        
            
//         int answer = 0;
        
//         int [] arr = new int[array.length];
        
        
//         for (int i=0; i < array.length; i++) {
//             arr[i] = Math.abs(array[i] - n);
//         }
        
//         for (int i=0; i < array.length; i++) {
//             for (int j=i; j < array.length; j++) {
//                 if (arr[j]<arr[i]) {
//                     int temp = arr[j];
//                     arr[j] = arr[i];
//                     arr[i] = temp;
//                 }
//             }
//         }
        
//         for (int i=0; i < array.length; i++) {
//             if (arr[0] == Math.abs(array[i] - n) && n==array[i]) {
//                 answer = array[i];
//                 break;
//             } else if (arr[0] == Math.abs(array[i] - n) && n>array[i]) {
//                 answer = array[i];
//                 break;
//             } else if (arr[0] == Math.abs(array[i] - n)) {
//                 answer = array[i];
//                 break;
//             }
//         }
       
    
         return result;
        }
    }
