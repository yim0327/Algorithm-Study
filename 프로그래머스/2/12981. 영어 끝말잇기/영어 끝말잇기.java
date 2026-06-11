import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {        
        HashSet<String> record = new HashSet<>();
        
        record.add(words[0]);
        String mem = words[0].substring(words[0].length()-1, words[0].length());
        
        for (int i = 1; i < words.length; i ++) {
            String f = words[i].substring(0, 1);
            String l = words[i].substring(words[i].length()-1, words[i].length());
            
            int len = record.size();
            
            if (mem.equals(f)) {
                record.add(words[i]);
                mem = l;
            }
            else {
                System.out.println(words[i]);
                return new int[] {i%n+1, i/n+1};
            }
            
            if (len == record.size()) {
                System.out.println(words[i]);
                return new int[] {i%n+1, i/n+1};
            }
        }

        return new int[] {0, 0};
    }
}