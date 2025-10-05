package ru.skillbox.notification_sender;

import ru.skillbox.notification.PushNotification;

import java.util.List;

/**
 * Сервис отправки Push уведомлений
 */
public class PushNotificationSender implements NotificationSender<PushNotification> {

    @Override
    public void send(PushNotification notification) {
        System.out.println(notification.getFormattedMessage());
    }

    @Override
    public void send(List<PushNotification> notifications) {
        for (PushNotification notification : notifications) {
            send(notification);
        }
    }
}