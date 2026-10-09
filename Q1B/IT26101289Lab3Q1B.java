import java.util.Scanner;
public class IT26101289Lab3Q1B {

    public static void main(String[] args) {
        double rice,discount,total,amount,kilograms;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of rice per kilogram: ");
        rice = input.nextDouble();
        System.out.print("Enter the number of kilograms purchased: ");
        kilograms = input.nextDouble();
        amount = rice * kilograms;
        discount = amount * 0.10;
        total = amount - discount;

        System.out.println("Total amount to be paid: " + total);
    }

}
