import java.util.Scanner;
public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double targetProfit = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double totalSum = 0;
        while (!"Party!".equals(input)){
            String cocktailName = input;
            int countOfCocktails = Integer.parseInt(scanner.nextLine());
            int lengthOfCocktail = cocktailName.length();

            double sum = countOfCocktails * lengthOfCocktail;
                if (sum % 2 != 0){
                    sum *= 0.75;
                }
            totalSum += sum;
                if (totalSum >= targetProfit){
                    break;
                }

            input = scanner.nextLine();
        }
        if ("Party!".equals(input)) {
            System.out.printf("We need %.2f leva more.\n", targetProfit - totalSum);
        }
        if (totalSum >= targetProfit){
            System.out.println("Target acquired.");
        }
        System.out.printf("Club income - %.2f leva.",totalSum);
    }
}