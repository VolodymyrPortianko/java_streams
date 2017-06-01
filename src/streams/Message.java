package streams;

import java.time.LocalDateTime;

/**
 * @author Volodymyr Portianko
 * @since 01.06.2017
 */
public class Message {
    public String text;
    public LocalDateTime datetime;

    public Message(String text, LocalDateTime datetime) {
        this.text = text;
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
