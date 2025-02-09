class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String st = Integer.toString(order);
        
        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) == '3' || st.charAt(i) == '6' || st.charAt(i) == '9'){
                answer++;
            }
        }
        
        return answer;
    }
}