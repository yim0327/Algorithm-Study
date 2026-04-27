class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < ingredient.length; i++) {
            sb.append(ingredient[i]);
        }
                
        while (sb.indexOf("1231") != -1) {
            int idx = sb.indexOf("1231");
            sb.delete(idx, idx+4);
            answer++;            
        }
        
        return answer;
    }
}