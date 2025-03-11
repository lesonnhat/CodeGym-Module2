import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the random list: ");
        int size = scanner.nextInt();

        RandomListFacade facade = new RandomListFacade();
        facade.printRandomEvenList(size);

        scanner.close();
    }
}