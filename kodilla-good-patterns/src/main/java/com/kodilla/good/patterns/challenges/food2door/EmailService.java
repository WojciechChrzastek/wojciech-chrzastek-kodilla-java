package com.kodilla.good.patterns.challenges.food2door;

public class EmailService implements UserInformationService, ProducerInformationService {
    public void informUser(User user) {
        System.out.println("Sending a confirmation email to: " + user.getRealName());
    }
    public void informProducer(Producer producer) {
        System.out.println("Sending a confirmation email to: " + producer.getClass());
    }
}
