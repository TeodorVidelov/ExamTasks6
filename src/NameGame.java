import java.util.Scanner;
public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();

        int maxPoints = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!"Stop".equals(playerName)){
            int points = 0;
            for (int i = 0; i < playerName.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());

                if (number == playerName.charAt(i)){
                    points += 10;
                }
                else {
                    points += 2;
                }
            }
        if (points >= maxPoints){
            maxPoints = points;
            bestPlayer = playerName;
        }
            playerName = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!",bestPlayer,maxPoints);
    }
}