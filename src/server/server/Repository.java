package server.server;

public interface Repository {
    String attribute1 = "";
    String attribute2 = "";

    void save(String text);

    String read();
}
