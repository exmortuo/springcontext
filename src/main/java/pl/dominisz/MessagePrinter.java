package pl.dominisz;

import com.google.inject.Inject;

public class MessagePrinter {

  private final MessageService service;

  @Inject
  public MessagePrinter(MessageService service) {
    this.service = service;
  }

  public void printMessage() {
    System.out.println(this.service.getMessage());
  }
}
