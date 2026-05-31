import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {        
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < B.length / 2; i++) {
            int tmp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = tmp;
        }
        
        int answer = 0;

        for (int j = 0; j < A.length; j++) {
            answer += A[j] * B[j];
        }

        return answer;
    }
}