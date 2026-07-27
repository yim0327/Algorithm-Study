import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {        
        Arrays.sort(citations);
                
        for (int i = 0; i < citations.length; i++) {
            // 논문 편수 줄여가며, 인용 횟수와 같거나 작아질 때 -> 현재 논문 편수 반환(최댓값)
            if (citations.length-i <= citations[i]) return citations.length-i;
        }
        
        return 0;
    }
}