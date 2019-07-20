package pl.dominisz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailSenderImpl implements EmailSender {

  private final EmailFilter emailFilter;

  @Autowired
  public EmailSenderImpl(EmailFilter emailFilter) {
    this.emailFilter = emailFilter;
  }

  @Override
  public void send(String email, String subject, String message) {
    if (emailFilter.canSend(email)) {
      System.out.println("Sending email to " + email);
      System.out.println("Subject: " + subject);
      System.out.println("Message: " + message);
    }
  }
}
