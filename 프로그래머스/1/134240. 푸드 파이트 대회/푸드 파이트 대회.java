class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int rp = (food[i] == 1 ? 0 : (int)food[i] / 2);
            String tmp = String.valueOf(i).repeat(rp);
            sb.append(tmp);
        }
                
        sb.append(new StringBuilder(sb.toString())
                  .reverse().toString())
                  .insert(sb.length()/2, "0");
        
        return sb.toString();
    }
}