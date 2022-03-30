import java.util.Scanner;
public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTheTeam = scanner.nextLine();
        int countPlayedMatches = Integer.parseInt(scanner.nextLine());

        int w = 0;
        int d = 0;
        int l = 0;
        int points = 0;

        for (int i = 0; i < countPlayedMatches; i++) {
            String result = scanner.nextLine();

            if ("W".equals(result)) {
                w++;
                points += 3;
            } else if ("D".equals(result)) {
                d++;
                points += 1;
            } else if ("L".equals(result)) {
                l++;
            }
        }
        if (countPlayedMatches <= 0) {
            System.out.printf("%s hasn't played any games during this season.", nameOfTheTeam);
        } else {
            System.out.printf("%s has won %d points during this season.\n",nameOfTheTeam,points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d\n",w);
            System.out.printf("## D: %d\n",d);
            System.out.printf("## L: %d\n",l);
            System.out.printf("Win rate: %.2f%%",(w * 1.0 / countPlayedMatches) * 100);
        }
    }
}