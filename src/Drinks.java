public class Drinks {
    private static final double Coffee_Price = 3.5 ;
    private static final double Tea_Price = 2.5 ;
    private static final double Lemonade_Price = 4.5 ;
    private static final double Moxito_Price = 5.5 ;
    private static final double Mineral_Price = 6.5 ;
    private static final double Coke_Price = 7.5 ;

    private static int totalDrinks = 0;
    private static double totalPrice = 0.0;

    public static void makeDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                System.out.println("Making coffee...");
                totalPrice += Coffee_Price;
                break;
            case TEA:
                System.out.println("Making tea...");
                totalPrice += Tea_Price;
                break;
            case LEMONADE:
                System.out.println("Making lemonade...");
                totalPrice += Lemonade_Price;
                break;
            case MOJITO:
                System.out.println("Making mojito...");
                totalPrice += Moxito_Price;
                break;
            case MINERAL_WATER:
                System.out.println("Pouring mineral water...");
                totalPrice += Mineral_Price;
                break;
            case COKE:
                System.out.println("Pouring coke...");
                totalPrice += Coke_Price;
                break;
        }
        totalDrinks++;
    }

    public static int getTotalDrinks() {
        return totalDrinks;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }
}


