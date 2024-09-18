import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int money = input.nextInt();

        if (money >= 1000) {
            int count = money / 1000;
            System.out.println("1000 - " + count);
            money %= 1000;
        }
        if (money >= 500) {
            int count = money / 500;
            System.out.println("500 - " + count);
            money %= 500;
        }
        if (money >= 100) {
            int count = money / 100;
            System.out.println("100 - " + count);
            money %= 100;
        }
        if (money >= 50) {
            int count = money / 50;
            System.out.println("50 - " + count);
            money %= 50;
        }
        if (money >= 20) {
            int count = money / 20;
            System.out.println("20 - " + count);
            money %= 20;
        }
        if (money >= 10) {
            int count = money / 10;
            System.out.println("10 - " + count);
            money %= 10;
        }
        if (money >= 5) {
            int count = money / 5;
            System.out.println("5 - " + count);
            money %= 5;
        }

        if (money > 0) {
            System.out.println("Remaining amount: " + money);
        }

        input.close();
    }
}
