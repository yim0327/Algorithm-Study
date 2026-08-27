import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] solution(String[] files) {
        Pattern p = Pattern.compile("^(\\D+)(\\d{1,5})(.*)$");
        
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Matcher m1 = p.matcher(o1);
                Matcher m2 = p.matcher(o2);
                
                if (m1.matches() && m2.matches()) {
                    String head1 = m1.group(1).toLowerCase();
                    String head2 = m2.group(1).toLowerCase();

                    int num1 = Integer.parseInt(m1.group(2));
                    int num2 = Integer.parseInt(m2.group(2));

                    if (!head1.equals(head2)) return head1.compareTo(head2);
                    else if (num1 != num2) return num1 - num2;
                    else return 0;
                }
                
                return 0;
            }
        });
        
        return files;
    }
}