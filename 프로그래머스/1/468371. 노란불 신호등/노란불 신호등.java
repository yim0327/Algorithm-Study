class Solution {
    // 최대 공약수
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    // 최소 공배수
    public int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
    
    public int solution(int[][] signals) {
        int second = 0;
        
        int[][] yellow = new int[signals.length][2];
        int[] terms = new int[signals.length];
        
        for (int i = 0; i < signals.length; i++) {
            yellow[i][0] = signals[i][0] + 1;              // 노랑 시작
            yellow[i][1] = signals[i][0] + signals[i][1];  // 노랑 종료
            
            terms[i] = signals[i][0] + signals[i][1] + signals[i][2];
        }
        
        int freq = 0;
        
        for (int i = 1; i < signals.length; i++) {
            if (freq == 0) {
                freq = lcm(Math.max(terms[i-1], terms[i])
                           , Math.min(terms[i-1], terms[i]));
            }
            else {
                freq = lcm(Math.max(freq, terms[i])
                           , Math.min(freq, terms[i]));
            }
        }
                
        for (int i = 0; i < freq; i++) {
            boolean flag = true;
            
            /**
                전부 노랑 = true
                하나라도 x = false
            */
            for (int j = 0; j < signals.length; j++) {
                if (second < yellow[j][0] || second > yellow[j][1]) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                return second;
            }
            else {  
                // 이번 노랑 끝 -> 다음 노랑 이동
                for (int k = 0; k < signals.length; k++) {
                    if (second == yellow[k][1]) {
                        yellow[k][0] += terms[k];
                        yellow[k][1] += terms[k];
                    }
                }
            }
            
            second++;
        }
        
        return -1;
    }
}