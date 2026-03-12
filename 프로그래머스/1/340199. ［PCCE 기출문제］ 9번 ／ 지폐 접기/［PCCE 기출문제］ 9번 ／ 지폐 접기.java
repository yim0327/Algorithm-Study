import java.util.Arrays;

class Solution {    
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        while (true) {
            if (wallet[0] >= bill[0] &&wallet[1] >= bill[1]) {
                break;
            }
            
            bill[1] = (int)(bill[1] / 2);
            answer++;
            
            int b = Math.max(bill[0], bill[1]);
            int m = Math.min(bill[0], bill[1]);
            
            bill[0] = m;
            bill[1] = b;
        }
        
        return answer;
    }
}