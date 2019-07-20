package pl.dominisz;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Application {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new MessageModule());

    MessagePrinter printer = injector.getInstance(MessagePrinter.class);
    printer.printMessage();

    EmailSender emailSender = injector.getInstance(EmailSender.class);
    emailSender.send("dominisz@gmail", "test", "Test 123");
  }
}
