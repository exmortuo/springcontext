package pl.dominisz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailFilterImpl implements EmailFilter {

  @Override
  public boolean canSend(String email) {
    return true;
  }
}
