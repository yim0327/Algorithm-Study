class Solution {
    public void spiral (int[][] answer, int n, int num, int shell){
        if(n <= 0){ return;}
        
        if(n == 1){
            answer[shell][shell] = num;
        }

        int outermost_shell = 4*(n-1);

        for(int i = 0; i < outermost_shell; i++){
            if(i < n){ // 위
                answer[shell][shell+i] = num;
            }
            else if(i >= n && i < 2*n-1){ // 우측
                answer[shell+(i-(n-1))][shell+(n-1)] = num; 
            }
            else if(i >= 2*n-1 && i < 3*n-2){ // 아래
                answer[shell+(n-1)][shell+3*(n-1)-i] = num;
            }
            else{ // 좌측
                answer[shell+4*(n-1)-i][shell] = num;
            }
            num++;
        }
        shell++;
        spiral(answer, n-2, num, shell);
    }
    
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int shell = 0;
        
        spiral(answer, n, num, shell);
        
        return answer;
    }
}
