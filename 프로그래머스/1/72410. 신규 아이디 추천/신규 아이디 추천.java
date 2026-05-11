class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase()                      // 1
                    .replaceAll("[^a-z0-9\\-\\_\\.]", "")  // 2
                    .replaceAll("\\.{2,}", ".")            // 3
                    .replaceAll("^\\.|\\.$", "");          // 4
        
        System.out.println(new_id);
        
        if (new_id.trim().equals("")) new_id = "a";        // 5
        if (new_id.length() >= 16) {                       // 6
            new_id = new_id.substring(0, 15)
                        .replaceAll("\\.$", "");
        }
        if (new_id.length() <= 2) {                        // 7
            String tmp = new_id.substring(new_id.length() - 1);
            while (true) {
                new_id += tmp;
                if (new_id.length() == 3) break;
            }
        }
        
        return new_id;
    }
}