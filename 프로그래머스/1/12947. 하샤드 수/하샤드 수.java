class Solution {
    public boolean solution(int x) {
        int tmp = 0;
        
        String[] s = String.valueOf(x).split("");
        
        for (String i : s) {
            tmp += Integer.parseInt(i);
        }
        
        if (x % tmp == 0) return true;
        
        return false;
    }
}