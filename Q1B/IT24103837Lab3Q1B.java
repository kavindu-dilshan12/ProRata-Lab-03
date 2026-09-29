import java.util.Scanner;

public class IT24103837Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        double total = price * kilograms;
        System.out.println();
        double discount = total * 10 / 100;
        double amountToPay = total - discount;
        System.out.println("The total amount with 10% discount is: " + amountToPay);

        input.close();
    }
}
