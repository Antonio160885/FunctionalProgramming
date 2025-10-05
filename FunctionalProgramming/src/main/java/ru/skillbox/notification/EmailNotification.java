package ru.skillbox.notification;

import java.util.List;

/**
 * Email уведомление
 */
public class EmailNotification implements Notification {
    private final String message;
    private final String subject;
    private final List<String> receivers;

    public EmailNotification(String message, String subject, List<String> receivers) {
        this.message = "<p>" + message + "</p>";
        this.subject = subject;
        this.receivers = receivers;
    }

    @Override
    public String formattedMessage() {
        return "";
    }

    @Override
    public String getFormattedMessage() {
        return "EMAIL\n" +
                "subject: " + subject + "\n" +
                "receivers: " + String.join(", ", receivers) + "\n" +
                "message: " + message + "\n";
    }

    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getReceivers() {
        return receivers;
    }
}