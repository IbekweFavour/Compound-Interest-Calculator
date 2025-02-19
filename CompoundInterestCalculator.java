import java.util.Scanner;

public class CompoundInterestCalculator{
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);

    // Compound Interest Calculator

double principal;
double rate;
int timesCompound;
int years;
double amount;

System.out.print("Enter the principal amount: ");
principal = scan.nextDouble();

System.out.print("Enter the interest rate: ");
rate = scan.nextDouble() / 100;

System.out.print("Enter the number of times compounded by year: ");
timesCompound = scan.nextInt();

System.out.print("Enter the number of years: ");
years = scan.nextInt();

amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * years);
System.out.printf("The amount after is: $" + amount);
    }
}