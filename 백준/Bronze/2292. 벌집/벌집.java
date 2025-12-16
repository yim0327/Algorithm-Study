import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int shell = 1;
        int boundary = 1 + 6 * shell;

        if (num == shell) {
            System.out.println(shell);
        }
        else {
            while (boundary < num) {
                shell++;
                boundary += 6 * shell;
            }
            System.out.println(shell+1);
        }
    }
}