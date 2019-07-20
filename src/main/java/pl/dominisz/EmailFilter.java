package pl.dominisz;

public interface EmailFilter {
  boolean canSend(String email);
}
