class Solution {
    public int[] solution(String myString) {
        String[] tmp = myString.split("x", -1);
        int[] answer = new int[tmp.length];
        
        for(int i = 0; i < tmp.length; i++){
            answer[i] = tmp[i].length();
        }
        
        return answer;
    }
}