package ru.skillbox.notification;

/**
 * Push уведомление
 */
public class PushNotification implements Notification {
    private final String message;
    private final String title;
    private final String receiver;

    public PushNotification(String message, String title, String receiver) {
        this.message = "👋 " + message; // Добавляем эмодзи
        this.title = title;
        this.receiver = receiver;
    }

    @Override
    public String formattedMessage() {
        return "";
    }

    @Override
    public String getFormattedMessage() {
        return "PUSH\n" +
                "title: " + title + "\n" +
                "receiver: " + receiver + "\n" +
                "message: " + message + "\n";
    }

    public String getMessage() {
        return message;
    }

    public String getTitle() {
        return title;
    }

    public String getReceiver() {
        return receiver;
    }
}