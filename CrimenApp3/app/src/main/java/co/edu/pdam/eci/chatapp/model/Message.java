package co.edu.pdam.eci.chatapp.model;

/**
 * Created by Julian Gonzalez Prieto (Avuuna la Luz del Alba) on 3/30/17.
 */

public class Message {

    private String message, user, imageUrl;

    public Message() {
    }

    public Message(String imageUrl) {
        setImageUrl(imageUrl);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message) o;

        if (!message.equals(message1.message)) return false;
        if (!user.equals(message1.user)) return false;
        return imageUrl != null ? imageUrl.equals(message1.imageUrl) : message1.imageUrl == null;

    }

    @Override
    public int hashCode() {
        int result = message.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }
}
