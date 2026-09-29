import java.util.Scanner;

public class IT24103837Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = input.nextInt();
        System.out.println();
        System.out.println("5000 Notes - " + amount / 5000);
        amount = amount % 5000;
        System.out.println("1000 Notes - " + amount / 1000);
        amount = amount % 1000;
        System.out.println("500 Notes - " + amount / 500);
        amount = amount % 500;
        System.out.println("200 Notes - " + amount / 200);
        amount = amount % 200;
        System.out.println("100 Notes - " + amount / 100);
        amount = amount % 100;
        System.out.println("50 Notes - " + amount / 50);
        amount = amount % 50;
        System.out.println("20 Notes - " + amount / 20);
        amount = amount % 20;
        System.out.println("10 Coins - " + amount / 10);
        amount = amount % 10;
        System.out.println("05 Coins - " + amount / 5);
        amount = amount % 5;
        System.out.println("02 Coins - " + amount / 2);
        amount = amount % 2;
        System.out.println("01 Coins - " + amount / 1);

        input.close();
    }
}
