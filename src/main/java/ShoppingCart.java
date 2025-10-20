import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int item = sc.nextInt();
        double sumOfStuff = 0;
        // TODO: Use a for loop to read each item's price (double)
        for (int i = 1; i <= item; i++)
        {
            System.out.print("Price of item " + i + "? ");
            double price = sc.nextDouble();
            sumOfStuff += price;
        }

        // TODO: Print the final summary line with item count and total
        System.out.printf("Your cart has %d items with a total cost of $%.1f", item, sumOfStuff);
        // TODO: Use Scanner for input
    }
}
