public class FileDownloaderProxy implements Downloader {
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
    private FileDownloader fileDownloader;

    @Override
    public void download(String url, String destination) {
        if (fileDownloader == null) {
            fileDownloader = new FileDownloader(USER_AGENT);
        }
        fileDownloader.download(url, destination);
    }
}