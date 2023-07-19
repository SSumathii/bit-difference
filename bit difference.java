import java.util.Scanner;
public class BinaryInputComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first binary input: ");
        String binaryInput1 = scanner.nextLine();
        System.out.print("Enter the second binary input: ");
        String binaryInput2 = scanner.nextLine();
        if (binaryInput1.length() != binaryInput2.length()) {
            System.out.println("Error: Inputs must have the same number of bits.");
        } else {
            int alteredBits = countAlteredBits(binaryInput1, binaryInput2);
            if (alteredBits == 0) {
                System.out.println("No change");
            } else {
                System.out.println("Number of bits altered: " + alteredBits);
            }
        }
    }
    private static int countAlteredBits(String binary1, String binary2) {
        int count = 0;

        for (int i = 0; i < binary1.length(); i++) {
            if (binary1.charAt(i) != binary2.charAt(i)) {
                count++;
            }
        }

        return count;
    }
} 