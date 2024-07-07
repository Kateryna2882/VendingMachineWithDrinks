import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean continueOrdering = true;

        while (continueOrdering) {
            System.out.println("Please choose a drink: coffee, tea, lemonade, mojito, mineral_water, coke");
            choice = scanner.nextLine().toUpperCase();

            try {
                DrinksMachine selectedDrink = DrinksMachine.valueOf(choice);
                Drinks.makeDrink(selectedDrink);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice, please try again.");
                continue;
            }

            System.out.println("Would you like to order another drink? (yes/no)");
            choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
                continueOrdering = false;
            }
        }

        System.out.println("Total drinks made: " + Drinks.getTotalDrinks());
        System.out.println("Total price: $" + Drinks.getTotalPrice());
    }
}