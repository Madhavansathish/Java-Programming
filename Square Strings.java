import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline

        while (t-- > 0) {
            String str = sc.nextLine();
            int n = str.length();
            int half = n / 2;

            if (n % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            boolean flag = true;
            for (int i = 0; i < half; i++) {
                if (str.charAt(i) != str.charAt(i + half)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
