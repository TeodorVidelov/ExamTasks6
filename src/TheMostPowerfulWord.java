import java.util.Scanner;
public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        double pointsPowerfulWord = Double.MIN_VALUE;
        String mostPowerfulWord = "";

        while (!"End of words".equals(word)){
            double points = 0;

            for (int i = 0; i < word.length(); i++) {
                points += word.charAt(i);
            }
            int numLength = word.length();
            String firstLetter = word.toLowerCase();

            if (firstLetter.charAt(0) == 'a' ||
                firstLetter.charAt(0) == 'e' ||
                firstLetter.charAt(0) == 'i' ||
                firstLetter.charAt(0) == 'o' ||
                firstLetter.charAt(0) == 'u' ||
                firstLetter.charAt(0) == 'y'){
                points *= numLength;
            }
            else {
                points = Math.floor(points / numLength);
            }
        if (points >= pointsPowerfulWord){
            pointsPowerfulWord = points;
            mostPowerfulWord = word;
        }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",mostPowerfulWord,pointsPowerfulWord);
    }
}