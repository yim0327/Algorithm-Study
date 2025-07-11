class Solution {
    public int solution(int M, int N) {
        return N*M-1;
    }
}

// (M-1)+((N-1)*M) = NM-N
// 세로로 다 자르기 -> M-1번
// 가로로 자르기 -> (N-1) * (M-1)번