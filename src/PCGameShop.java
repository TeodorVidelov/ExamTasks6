import java.util.Scanner;
public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSoldGames = Integer.parseInt(scanner.nextLine());

        int Hearthstone = 0;
        int Fornite = 0;
        int Overwatch = 0;
        int Others = 0;

        for (int i = 0; i < countSoldGames; i++) {
            String nameOfTheGame = scanner.nextLine();

                if ("Hearthstone".equals(nameOfTheGame)){
                    Hearthstone++;
                }
                else if ("Fornite".equals(nameOfTheGame)){
                    Fornite++;
                }
                else if ("Overwatch".equals(nameOfTheGame)){
                    Overwatch++;
                }
                else {
                    Others++;
                }
        }
        System.out.printf("Hearthstone - %.2f%%\n",(Hearthstone * 1.0 / countSoldGames) * 100);
        System.out.printf("Fornite - %.2f%%\n",(Fornite * 1.0 / countSoldGames) * 100);
        System.out.printf("Overwatch - %.2f%%\n",(Overwatch / 1.0 / countSoldGames) * 100);
        System.out.printf("Others - %.2f%%",(Others * 1.0 / countSoldGames) * 100);
    }
}