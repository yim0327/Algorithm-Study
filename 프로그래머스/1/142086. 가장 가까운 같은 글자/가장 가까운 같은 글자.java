import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] arr = s.split("");
                
        for (int i = 0; i < s.length(); i++) {
            String[] tmp = Arrays.copyOfRange(arr, 0, i);
            String stmp = String.join("", tmp);
            
            if (i != 0 && stmp.contains(arr[i])) {
                answer[i] = i - stmp.lastIndexOf(arr[i]);
            }
            else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}