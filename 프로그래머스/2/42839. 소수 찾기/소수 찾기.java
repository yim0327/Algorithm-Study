import java.util.Arrays;
import java.util.HashSet;

class Solution {
    static HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {        
        String[] strArr = numbers.split("");
        
        permutation(
                    strArr,
                    new String[strArr.length],  // 중간 조합 저장용
                    new boolean[strArr.length], // 방문 기록용
                    0                           // 깊이 체크
                   );
        
        return set.size();
    }
    
    /* 순열 */
    private void permutation(String[] strArr, String[] out, boolean[] visited, int depth) {
        if (depth == strArr.length) {
            func(out, depth);
            return;
        }
        
        for (int i = 0; i < strArr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[depth] = strArr[i];
                                
                func(out, depth);
                
                permutation(strArr, out, visited, depth+1);
                visited[i] = false;
            }
        }
    }
    
    /* 변환 및 개수 세기 */
    private void func(String[] arr, int depth) {
        String tmp = String.join("", Arrays.copyOfRange(arr, 0, depth));
        if (tmp.equals("")) return;
        
        int n = Integer.parseInt(tmp);
        if (checkPrime(n)) set.add(n);
    }
    
    /* 소수 판별 */
    private boolean checkPrime(int n) {                
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}