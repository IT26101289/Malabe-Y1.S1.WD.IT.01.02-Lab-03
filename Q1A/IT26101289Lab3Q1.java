import java.util.Scanner;
public class IT26101289Lab3Q1 {
    public static void main(String[] args) {
        double price,kilograms,amount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price: ");
        price = input.nextDouble();
        System.out.print("Enter the kilograms: ");
        kilograms = input.nextDouble();
        amount = price * kilograms;
        System.out.println("amount is " + amount );
        }
}