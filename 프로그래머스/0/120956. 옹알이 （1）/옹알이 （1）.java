class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String st = "";
        
        for(int i = 0; i < babbling.length; i++){
            st = babbling[i];
            
            if(st.contains("aya") 
               || st.contains("ye") 
               || st.contains("woo")
               || st.contains("ma")){
                st = st.replaceAll("aya|ye|woo|ma", "");
            }
                           
            if(st.equals("")) answer++;
        }
        
        return answer;
    }
}