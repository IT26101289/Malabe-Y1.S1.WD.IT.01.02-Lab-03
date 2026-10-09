import java.util.Scanner;
public class IT26101289Lab3Q3 {
  public static void main(String[] args) {
    int amount;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the rupee amount: ");
    amount = input.nextInt();
    System.out.println("5000 Notes -  " + (amount / 5000));
    amount %= 5000;
    System.out.println("1000 Notes -  " + (amount / 1000));
    amount %= 1000;
    System.out.println("500 Notes -  " + (amount / 500));
    amount %= 500;
    System.out.println("100 Notes -  " + (amount / 200));
    amount %= 200;
    System.out.println("50 Notes -  " + (amount / 100));
    amount %= 100;
    System.out.println("10 Notes -  " + (amount / 50));
    amount %= 50;
    System.out.println("5 Notes -  " + (amount / 20));
    amount %= 20;
    System.out.println("5 Notes -  " + (amount / 10));
    amount %= 10;
    System.out.println("5 Notes -  " + (amount / 5));
    amount %= 5;
    System.out.println("5 Notes -  " + (amount / 2));
    amount %= 2;
    System.out.println("1 Notes -  " + amount);
    input.close();
   }
}