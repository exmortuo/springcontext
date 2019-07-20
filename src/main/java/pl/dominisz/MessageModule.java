package pl.dominisz;

import com.google.inject.AbstractModule;

public class MessageModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(EmailFilter.class).to(EmailFilterImpl.class);
    bind(MessageService.class).to(MessageServiceImpl.class);
    bind(EmailSender.class).to(EmailSenderImpl.class);
  }
}
