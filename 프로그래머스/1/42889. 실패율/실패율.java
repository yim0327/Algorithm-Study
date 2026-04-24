import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int players = stages.length;

        // 각 스테이지당 멈춰있는 플레이어 수
        int[] stop = new int[N];
        
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N+1) continue;
            stop[stages[i]-1]++;
        }        
        
        // 스테이지 별 실패율 계산
        double[] rate = new double[N];
        
        for (int j = 0; j < N; j++) {
            if (players == 0) rate[j] = 0;
            else rate[j] = (double)stop[j] / players;
            //System.out.printf("%.4f%n", rate[j]);
            players -= stop[j];
        }
        
        // 실패율 내림차순 배열 세팅
        double[] copy = Arrays.copyOf(rate, N);
        Arrays.sort(copy);
        
        double[] rsort = new double[N];
        
        for (int k = 0; k < N; k++) {
            rsort[k] = copy[N-k-1];
        }
        
        // 스테이지 실패율 내림차순 정렬
        int[] answer = new int[N];
        
        for (int l = 0; l < N; l++) { // rate
            for (int x = 0; x < N; x++) { // rsort
                if (rate[l] == rsort[x]) {
                    answer[x] = l + 1;
                    rsort[x] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}