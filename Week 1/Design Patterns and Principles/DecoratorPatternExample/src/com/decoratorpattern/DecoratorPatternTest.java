// DecoratorPatternTest.java
package com.decoratorpattern;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        Notifier slackNotifier = new SlackNotifierDecorator(emailNotifier);

        Notifier combinedNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(emailNotifier));

        System.out.println("Sending notification using basic Email Notifier:");
        emailNotifier.send("Hello World!");

        System.out.println("\nSending notification using Email + SMS Notifier:");
        smsNotifier.send("Hello World!");

        System.out.println("\nSending notification using Email + Slack Notifier:");
        slackNotifier.send("Hello World!");

        System.out.println("\nSending notification using Email + SMS + Slack Notifier:");
        combinedNotifier.send("Hello World!");
    }
}
