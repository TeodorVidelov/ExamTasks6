import java.util.Scanner;
public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int countOfPeople = Integer.parseInt(scanner.nextLine());
            double taxEntrance = Double.parseDouble(scanner.nextLine());
            double priceOfOneLounge = Double.parseDouble(scanner.nextLine());
            double priceOfOneUmbrella = Double.parseDouble(scanner.nextLine());

            double sumEntrance = countOfPeople * taxEntrance;
            double seventyFivePercentWantLounge = Math.ceil(countOfPeople * 0.75);
            double sumLounge = seventyFivePercentWantLounge * priceOfOneLounge;
            double oneUmbrellaForTwoPeople = Math.ceil(countOfPeople * 0.50);
            double sumUmbrella = oneUmbrellaForTwoPeople * priceOfOneUmbrella;

            double totalSum = sumEntrance + sumLounge + sumUmbrella;
        System.out.printf("%.2f lv.",totalSum);
    }
}