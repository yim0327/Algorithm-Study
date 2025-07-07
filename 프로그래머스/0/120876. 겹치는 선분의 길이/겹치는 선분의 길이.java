class Solution {
    public int solution(int[][] lines) {
        // -100~100 -> 0~200 -> 200칸
        int answer = 0;
        int[] check = new int[200];
        
        for(int i = 0; i < 3; i++){
            for(int j = lines[i][0]+100; j < lines[i][1]+100; j++){
                check[j]++;
            }
        }
        
        for(int j = 0; j < check.length; j++){
            if(check[j] >= 2){
                answer++;
            }
        }
        
        return answer;
    }
}