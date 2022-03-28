import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDrink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countOfDrinks = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (typeOfDrink){
            case "Espresso":
                switch (sugar){
                    case "Without":
                        price = 0.90 * 0.65;
                        break;
                    case "Normal":
                        price = 1.00;
                        break;
                    case "Extra":
                        price = 1.20;
                        break;
                }

                if (countOfDrinks >= 5){
                    price *= 0.75;
                }
                break;
            case "Cappuccino":
                switch (sugar){
                    case "Without":
                        price = 1.00 * 0.65;
                        break;
                    case "Normal":
                        price = 1.20;
                        break;
                    case "Extra":
                        price = 1.60;
                        break;
                }
                break;
            case "Tea":
                switch (sugar){
                    case "Without":
                        price = 0.50 * 0.65;
                        break;
                    case "Normal":
                        price = 0.60;
                        break;
                    case "Extra":
                        price = 0.70;
                        break;
                }
                break;
        }
        double totalSum = countOfDrinks * price;
        if (totalSum > 15){
            totalSum *= 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",countOfDrinks,typeOfDrink,totalSum);
    }
}