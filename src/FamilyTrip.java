import java.util.Scanner;
public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countOfNights = Integer.parseInt(scanner.nextLine());
        double priceOfNight = Double.parseDouble(scanner.nextLine());
        int percentAdditionalCosts = Integer.parseInt(scanner.nextLine());


        if (countOfNights > 7){
            priceOfNight *= 0.95;
        }
        double sumNights = countOfNights * priceOfNight;
        double sumAdditionalCosts = budget * ((percentAdditionalCosts * 1.0) / 100);
        double totalSum = sumNights + sumAdditionalCosts;

        if (budget >= totalSum){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - totalSum);
        }
        else {
            System.out.printf("%.2f leva needed.",totalSum - budget);
        }
    }
}