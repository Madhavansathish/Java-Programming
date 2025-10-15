import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        while (t-- > 0) {
            String a = sc.nextLine();
            StringBuilder b = new StringBuilder();

            b.append(a.charAt(0));

            for (int i = 1; i < a.length(); i += 2) {
                b.append(a.charAt(i)); 
            }

            System.out.println(b.toString());
        }

        sc.close();
    }
}
