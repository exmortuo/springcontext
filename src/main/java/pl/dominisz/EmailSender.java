package pl.dominisz;

public interface EmailSender {

    void send(String email, String subject, String message);
}
