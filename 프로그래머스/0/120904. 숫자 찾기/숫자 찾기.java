class Solution {
    public int solution(int num, int k) {
        String st = String.valueOf(num);
        int idx = st.indexOf(String.valueOf(k));
        
        return  st.contains(String.valueOf(k)) ? idx+1 : -1;
    }
}