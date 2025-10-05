package ru.skillbox.notification_sender;

import ru.skillbox.notification.EmailNotification;

import java.util.List;

/**
 * Сервис отправки Email уведомлений
 */
public class EmailNotificationSender implements NotificationSender<EmailNotification> {

    @Override
    public void send(EmailNotification notification) {
        System.out.println(notification.getFormattedMessage());
    }

    @Override
    public void send(List<EmailNotification> notifications) {
        for (EmailNotification notification : notifications) {
            send(notification);
        }
    }
}