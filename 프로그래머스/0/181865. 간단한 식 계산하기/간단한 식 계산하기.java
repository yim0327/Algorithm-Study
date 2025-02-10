class Solution {
    public int solution(String binomial) {
        String[] cal = binomial.split(" ");
        int a = Integer.parseInt(cal[0]);
        int b = Integer.parseInt(cal[2]);
        return (cal[1].equals("+")) ? a+b :
                (cal[1].equals("-")) ? a-b :
                (cal[1].equals("*")) ? a*b : -1;
    }
}