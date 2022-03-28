import java.util.Scanner;
public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String typeOfPacket = scanner.nextLine();
        boolean vip = scanner.nextLine().equals("yes");
        int countDays = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;

        double price = 0;
        if (countDays > 7){
            countDays--;
        }
        switch (town) {
            case "Bansko":
            case "Borovets":
                if  (vip) {
                    if ("withEquipment".equals(typeOfPacket)) {
                        price = 100 * 0.90;

                    } else if ("noEquipment".equals(typeOfPacket)) {
                        price = 80 * 0.95;
                    } else {
                        isValid = true;
                    }
                }
                else {
                    if ("withEquipment".equals(typeOfPacket)) {
                        price = 100;

                    } else if ("noEquipment".equals(typeOfPacket)) {
                        price = 80;
                    } else {
                        isValid = true;
                    }
                }
                break;
            case "Varna":
            case "Burgas":
                if  (vip) {
                    if ("withBreakfast".equals(typeOfPacket)) {
                        price = 130 * 0.88;

                    } else if ("noBreakfast".equals(typeOfPacket)) {
                        price = 100 * 0.93;
                    } else {
                        isValid = true;
                    }
                } else {
                    if ("withBreakfast".equals(typeOfPacket)) {
                        price = 130;
                    } else if ("noBreakfast".equals(typeOfPacket)) {
                        price = 100;
                    } else {
                        isValid = true;
                    }
                }
                break;
        default:
        isValid = true;

        break;
        }
        if (isValid){
            System.out.println("Invalid input!");
        }
        else if (countDays < 1){
            System.out.println("Days must be positive number!");
        }
        else {
            System.out.printf("The price is %.2flv! Have a nice time!", price * countDays);
        }
    }
}