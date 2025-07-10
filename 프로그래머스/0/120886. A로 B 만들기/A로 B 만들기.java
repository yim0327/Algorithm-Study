class Solution {
    public int solution(String before, String after) {
        int answer = -1;
        
        for(int i = 0; i < before.length(); i++){
            for(int j = 0; j < after.length(); j++){
                if(before.charAt(i)==after.charAt(j)){
                    after = after.replaceFirst(before.charAt(i)+"", " ");
                    before = before.replaceFirst(before.charAt(i)+"", " ");
                }
            }
        }
        
        after = after.replace(" ","");
        answer = after.equals("") ? 1 : 0;
        return answer;
    }
}