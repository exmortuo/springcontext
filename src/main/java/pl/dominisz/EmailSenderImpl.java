package pl.dominisz;

import com.google.inject.Inject;

public class EmailSenderImpl implements EmailSender {

  private final EmailFilter emailFilter;

  @Inject
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
