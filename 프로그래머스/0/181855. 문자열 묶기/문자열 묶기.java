class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] cnt = new int[31];
        
        for(int i = 0; i < strArr.length; i++){
            cnt[strArr[i].length()]++;
        }
        
        for(int j = 0; j < cnt.length; j++){
            if(answer < cnt[j]){
                answer = cnt[j];
            }
        }
        
        return answer;
    }
}