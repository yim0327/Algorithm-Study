class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            StringBuilder sb = new StringBuilder(Long.toBinaryString(numbers[i]));
            sb.insert(0, "0".repeat(50-sb.length()));
            
            int idx1 = sb.lastIndexOf("0");
            int idx2 = sb.lastIndexOf("10");
            int idx3 = sb.lastIndexOf("01");
            
            if (idx1 > idx2 && idx1 > idx3) sb.replace(idx1, idx1+1, "1");
            else if (idx2 == -1 || idx2 < idx3) sb.replace(idx3, idx3+2, "10");
            else if (idx3 == -1 || idx2 > idx3) sb.replace(idx2+1, idx2+2, "1");
            
            answer[i] = Long.parseLong(sb.toString(), 2);
        }
        
        return answer;
    }
}