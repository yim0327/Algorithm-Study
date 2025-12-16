import java.util.Scanner;

public class Main {
    public static String giveChange(int money) {
        String change = "";

        change += Integer.toString((int)(money / 25));
        money %= 25;
        change += " "+ money / 10;
        money %= 10;
        change += " "+ money / 5;
        money %= 5;
        change += " "+ money;

        return change;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());

        String[] changeBox = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            String tmp = giveChange(Integer.parseInt(sc.nextLine()));
            changeBox[i] = tmp;
        }

        for (String box : changeBox) {
            System.out.println(box);
        }
    }
    
}
