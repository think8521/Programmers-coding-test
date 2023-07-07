import java.util.*;



class Solution {
    public int solution(int[] array) {
        int[] array2 = new int[array.length];
        int answer = 0;
        if (array.length == 1) {
            answer = array[0];
            return answer;
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array2[i] != -1) {
                array2[i] = array[i];
            }
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array2[j] = -1;
                }
            }
        }
       
            
        int countn = 0;
        for (int i = 0; i < array.length; i++) {
            if (array2[i] != -1) {
                countn++;
            }
        }
        if (countn == 1) {
            answer = array[0];
            return answer;
        }
        
        
        int[] setarr = new int[countn];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array2[i] != -1) {
                setarr[j++] = array2[i];
            }
        }
        int[] count = new int[setarr.length];
        for (int i = 0; i < setarr.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (setarr[i] == array[k]) {
                    count[i]++;
                }
            }
        }
        
        int[] count2 = count.clone();
        
        Arrays.sort(count);
         for (int arr : count) {
            System.out.println(arr);
        }
        
        if (count[countn-1] != count[countn-2]) {
            for (int i = 0; i < countn; i++) {
                if (count2[i] == count[countn-1]) {
                    answer = setarr[i];
                }
            }
        } else {
            answer = -1;
        }
        return answer;
    }
}