import java.util.Scanner;
public class IT26101289Lab3Q2 {
public static void main(String[] args) {
    double otAmount,totalSalary,mounthlySalary,otHourlyRate,otHours;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the monthly salary: ");
    mounthlySalary = input.nextDouble();
    System.out.print("Enter the OT hours: ");
    otHours = input.nextDouble();
    System.out.print("Enter the OT hourly rate: ");
    otHourlyRate = input.nextDouble();

    otAmount = otHours * otHourlyRate;
    totalSalary = mounthlySalary + otAmount;

    System.out.println("Overtime Amount: " + otAmount);
    System.out.println("Total Salary: " + totalSalary);

} 
}
