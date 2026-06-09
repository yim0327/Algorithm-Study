class Solution {
    // 최소 공약수
    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
    // 최소 공배수
    public int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
    
    public int solution(int[] arr) {
        int answer = lcm(Math.max(arr[0], arr[1]), Math.min(arr[0], arr[1]));
        
        for (int i = 2; i < arr.length; i++) {
            answer = lcm(Math.max(answer, arr[i]), Math.min(answer, arr[i]));
        }
        
        return answer;
    }
}