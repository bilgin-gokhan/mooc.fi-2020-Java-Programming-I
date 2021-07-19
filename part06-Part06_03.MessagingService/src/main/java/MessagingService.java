
import java.util.ArrayList;

public class MessagingService {

    ArrayList<Message> messages = new ArrayList<>();

    public void MessagingService() {

    }

    public void add(Message message) {
        if (message.messageLengthValid()) {
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

}
