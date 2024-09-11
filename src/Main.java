import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        double initialValue;
        double salesTax = 0.05;
        double tax;
        double total;

        System.out.println("Enter the price of a purchase.");
        initialValue = scan.nextDouble();
        tax = initialValue * salesTax;
        total = initialValue + tax;

        System.out.println("For a purchase of $" + initialValue + " with a sales tax of " + salesTax * 100 + "%," +
                " the sales tax will be $" + tax + " bringing the total to $" + total + ".");
    }
}