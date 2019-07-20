package pl.dominisz;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NullEmailSender implements EmailSender {
  @Override
  public void send(String email, String subject, String message) {
    System.out.println("Not sending emails");
  }
}
