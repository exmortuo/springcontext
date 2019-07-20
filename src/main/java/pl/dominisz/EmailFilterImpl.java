package pl.dominisz;

public class EmailFilterImpl implements EmailFilter {

  @Override
  public boolean canSend(String email) {
    return true;
  }
}
