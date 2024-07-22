import java.util.*;
public class IPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();
        boolean isValid = true;
        String[] parts = ipAddress.split("\\.");
        if (parts.length != 4) {
            isValid = false;
        } else {
            for (String part : parts) {
                try {
                    int value = Integer.parseInt(part);
                    if (value < 0 || value > 255) {
                        isValid = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid) {
            System.out.println("Valid IP address.");
            int firstOctetValue = Integer.parseInt(parts[0]);
            if (firstOctetValue >= 1 && firstOctetValue <= 126) {
                System.out.println("IP address belongs to Class A");
            } else if (firstOctetValue >= 128 && firstOctetValue <= 191) {
                System.out.println("IP address belongs to Class B");
            } else if (firstOctetValue >= 192 && firstOctetValue <= 223) {
                System.out.println("IP address belongs to Class C");
            } else if (firstOctetValue >= 224 && firstOctetValue <= 239) {
                System.out.println("IP address belongs to Class D");
            } else if (firstOctetValue >= 240 && firstOctetValue <= 255) {
                System.out.println("IP address belongs to Class E");
            }
        } else {
            System.out.println("Invalid IP address.");
        }
    }
}