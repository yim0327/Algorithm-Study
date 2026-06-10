import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet();
        
        for (int i = 1; i <= elements.length; i++) { // 수열의 길이
            if (i == 1) {
                for (int e : elements) {
                    set.add(e);
                } 
            }
            else if (i == elements.length) {
                int sum = 0;
                
                for (int e : elements) {
                    sum += e;
                } 
                
                set.add(sum);
            }
            else {
                for (int j = 0; j < elements.length; j++) {
                    int sum = 0;
                    
                    // 길이만큼 반복 = 수열 요소 한 개
                    for (int k = j; k < j+i; k++) {
                        int idx = k%elements.length;
                        sum += elements[idx];
                    }
                    
                    set.add(sum);
                }
            }
        }
        
        return set.size();
    }
}