import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        ArrayList<int[]> arr = new ArrayList<>();
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    int[] pos = {i, j}; 
                    arr.add(pos);
                }
            }
        }
        int[][] array = new int[arr.size()][2];
        
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        //1
        ans.add(array[0][0]);
        //2
        int temp = 50;
        for (int[] pos : array) {
            if (pos[1] <= temp) {
                temp = pos[1];
            }
        }
        ans.add(temp);
        //3
        ans.add(array[array.length - 1][0]+1);
        //4
        temp = 0;
        for (int[] pos : array) {
            if (pos[1] >= temp) {
                temp = pos[1];
            }
        }
        ans.add(temp+1);
        
        
        int[] answer = new int[4];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}