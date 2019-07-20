package pl.dominisz;

import org.springframework.stereotype.Component;

@Component
public class EmailSenderImpl implements EmailSender {
  @Override
  public void send(String email, String subject, String message) {
    System.out.println("Sending email to " + email);
    System.out.println("Subject: " + subject);
    System.out.println("Message: " + message);
  }
}
