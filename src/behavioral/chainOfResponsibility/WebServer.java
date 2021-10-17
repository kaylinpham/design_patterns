package behavioral.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        // Authentication
        // Logging
        // Compression
        handler.handle(request);
    }
}
