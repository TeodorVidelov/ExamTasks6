import java.util.Scanner;
public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOfTheWall = Integer.parseInt(scanner.nextLine());
        int widthOfTheWall = Integer.parseInt(scanner.nextLine());
        int percentOfTotalAreaWontBePainted=  Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int areaForPainting = heightOfTheWall * widthOfTheWall * 4;
        double percentWontBePainted = areaForPainting * ((percentOfTotalAreaWontBePainted * 1.0) / 100);
        double totalAreaForPainting = Math.ceil(areaForPainting - percentWontBePainted);

        int litersPaint = 0;

        while (!"Tired!".equals(input)){
             totalAreaForPainting -= litersPaint = Integer.parseInt(input);

                if (totalAreaForPainting <= 0){
                    break;
                }
            input = scanner.nextLine();
        }
        if (totalAreaForPainting == 0){
            System.out.println("All walls are painted! Great job, Pesho!");
        }
        else if (totalAreaForPainting > 0){
            System.out.printf("%.0f quadratic m left.",totalAreaForPainting);
        }
        else {
            System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(totalAreaForPainting));
        }
    }
}