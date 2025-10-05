package ru.skillbox;

import ru.skillbox.notification.EmailNotification;
import ru.skillbox.notification.PushNotification;
import ru.skillbox.notification.SmsNotification;
import ru.skillbox.notification_sender.EmailNotificationSender;
import ru.skillbox.notification_sender.NotificationSender;
import ru.skillbox.notification_sender.PushNotificationSender;
import ru.skillbox.notification_sender.SmsNotificationSender;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Создаем сервисы отправки
        NotificationSender<EmailNotification> emailSender = new EmailNotificationSender();
        NotificationSender<SmsNotification> smsSender = new SmsNotificationSender();
        NotificationSender<PushNotification> pushSender = new PushNotificationSender();

        System.out.println("=== СОЗДАНИЕ УВЕДОМЛЕНИЙ ===");

        // Создаем по три уведомления каждого типа

        // Email уведомления
        EmailNotification email1 = new EmailNotification(
                "Спасибо за регистрацию на сервисе!",
                "Успешная регистрация!",
                Arrays.asList("oleg@java.skillbox.ru", "masha@java.skillbox.ru", "yan@java.skillbox.ru")
        );

        EmailNotification email2 = new EmailNotification(
                "Ваш заказ был доставлен",
                "Заказ доставлен",
                Arrays.asList("client@example.com")
        );

        EmailNotification email3 = new EmailNotification(
                "Подтвердите ваш email адрес",
                "Подтверждение email",
                Arrays.asList("newuser@service.com", "admin@service.com")
        );

        // SMS уведомления
        SmsNotification sms1 = new SmsNotification(
                "Спасибо за регистрацию на сервисе!",
                Arrays.asList("+70001234567")
        );

        SmsNotification sms2 = new SmsNotification(
                "Ваш код подтверждения: 123456",
                Arrays.asList("+79998887766", "+75554443322")
        );

        SmsNotification sms3 = new SmsNotification(
                "Заказ №12345 готов к выдаче",
                Arrays.asList("+71112223344")
        );

        // Push уведомления
        PushNotification push1 = new PushNotification(
                "Спасибо за регистрацию на сервисе!",
                "Успешная регистрация!",
                "o.yanovich"
        );

        PushNotification push2 = new PushNotification(
                "У вас новое сообщение",
                "Новое сообщение",
                "m.ivanova"
        );

        PushNotification push3 = new PushNotification(
                "Акция недели началась!",
                "Специальное предложение",
                "a.petrov"
        );

        System.out.println("=== ОТПРАВКА ОДИНОЧНЫХ УВЕДОМЛЕНИЙ ===");

        // Отправка одиночных уведомлений
        emailSender.send(email1);
        smsSender.send(sms1);
        pushSender.send(push1);

        System.out.println("=== ОТПРАВКА СПИСКОВ УВЕДОМЛЕНИЙ ===");

        System.out.println("--- Email уведомления ---");
        List<EmailNotification> emailList = Arrays.asList(email1, email2, email3);
        emailSender.send(emailList);

        System.out.println("--- SMS уведомления ---");
        List<SmsNotification> smsList = Arrays.asList(sms1, sms2, sms3);
        smsSender.send(smsList);

        System.out.println("--- Push уведомления ---");
        List<PushNotification> pushList = Arrays.asList(push1, push2, push3);
        pushSender.send(pushList);
    }
}