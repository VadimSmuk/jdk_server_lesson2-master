package server.server;

public interface View {
    void showMessage(String text);

    void disconnect();

    void connect();
}
