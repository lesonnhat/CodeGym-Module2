import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the URL to download: ");
        String url = scanner.nextLine();

        System.out.print("Enter the destination path (e.g., C:\\downloads\\file.txt): ");
        String destination = scanner.nextLine();

        Downloader downloader = new FileDownloaderProxy();
        downloader.download(url, destination);

        scanner.close();
    }
}