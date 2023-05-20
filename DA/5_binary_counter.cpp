import java.util.Scanner;

public class binaryCouter {
    public static void main(String[] args) {
        System.out.println("Enter the value for counter in binary: ");
        Scanner sc = new Scanner(System.in);
        String ctr = sc.nextLine();
        int counter = Integer.parseInt(ctr, 2);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        sc.close();
        int value = start;
        for (int i = 0; i < n; i++) {
            value = value + counter;
        }
        System.out.println(Integer.toBinaryString(value));
    }
}