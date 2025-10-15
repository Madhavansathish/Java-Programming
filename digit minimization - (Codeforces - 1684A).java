import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // number of test cases
        while (n-- > 0) {
            int num = sc.nextInt();
            int temp = num;
            int count = 0;
            
            // count digits
            while (num > 0) {
                count++;
                num /= 10;
            }
            
            int min = 9;
            if (count > 2) {
                while (temp > 0) {
                    int d = temp % 10;
                    if (d < min) {
                        min = d;
                    }
                    temp /= 10;
                }
                System.out.println(min);
            } else {
                // if number has <= 2 digits, print last digit
                min = temp % 10;
                System.out.println(min);
            }
        }
        sc.close();
    }
}
