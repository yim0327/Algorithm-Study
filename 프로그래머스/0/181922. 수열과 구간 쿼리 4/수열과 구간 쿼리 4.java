class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int r = 0; r < queries.length; r++){ // row
            for(int i = 0; i < 5; i++){ // i = 0, 1, 2, 3, 4
                if(i >= queries[r][0] && i <= queries[r][1]){
                    if(i % queries[r][2] == 0){ // k의 배수일 때,
                        arr[i] += 1;
                    }
                }
            }
        }
        
        return arr;
    }
}