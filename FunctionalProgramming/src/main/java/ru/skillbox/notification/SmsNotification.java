package ru.skillbox.notification;

import java.util.List;

/**
 * SMS уведомление
 */
public class SmsNotification implements Notification {
    private final String message;
    private final List<String> receivers;

    public SmsNotification(String message, List<String> receivers) {
        this.message = message;
        this.receivers = receivers;
    }

    @Override
    public String formattedMessage() {
        return "";
    }

    @Override
    public String getFormattedMessage() {
        return "SMS\n" +
                "receivers: " + String.join(", ", receivers) + "\n" +
                "message: " + message + "\n";
    }

    public String getMessage() {
        return message;
    }

    public List<String> getReceivers() {
        return receivers;
    }
}