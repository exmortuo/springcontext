package pl.dominisz;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
