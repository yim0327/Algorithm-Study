class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++){
            int ascii = (int)my_string.charAt(i);
            
            if(ascii >= 65 && ascii <= 90){
                answer[ascii-65]++;
            }
            if(ascii >= 97 && ascii <= 122){
                answer[ascii-97+26]++;
            }
        }
        
        return answer;
    }
}