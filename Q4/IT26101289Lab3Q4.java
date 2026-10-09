import java.util.Scanner;
public class IT26101289Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        int FirstDigit = number / 10000;
        System.out.println("The first digit of the number : " + FirstDigit);

        int SecondDigit = (number / 1000) % 10;
        System.out.println("The second digit of the number : " + SecondDigit);

        int ThirdDigit = (number / 100) % 10;
        System.out.println("The third digit of the number : " + ThirdDigit);

        int FourthDigit = (number / 10) % 10;
        System.out.println("The fourth digit of the number : " + FourthDigit);

        int FifthDigit = number % 10;
        System.out.println("The fifth digit of the number : " + FifthDigit);

     System.out.println("The sum of the digits of the number : " + (FirstDigit + SecondDigit + ThirdDigit + FourthDigit + FifthDigit));
     System.out.println(FirstDigit + "  " + SecondDigit + "  " + ThirdDigit + "  " + FourthDigit + "  " + FifthDigit );

    }
}
