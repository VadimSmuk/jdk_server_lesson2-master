package server.server;

public interface Controller {
    Repository repository = new FileStorage();

    View ui = new SwingUI();

    void showMessage(String text);

    void disconnect();

    void connect();
}
