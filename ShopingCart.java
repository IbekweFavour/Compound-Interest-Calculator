import java.util.Scanner;

public class ShopingCart{
    public static void  main(String... args){
        Scanner input = new Scanner(System.in);
        String itemBought;
        double prize;
        int numberOfItem;
        double total;

        System.out.print("What would you like to buy? ");
        itemBought = input.next();
        
        System.out.print("What is the price for each? ");
        prize = input.nextDouble();
        
        System.out.print("How many would you like? ");
        numberOfItem = input.nextInt();

        total = prize * numberOfItem;
        System.out.println("You bought " + numberOfItem + " "+ itemBought);
        System.out.print("Your total is $" + total);
    }
}