package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producer.Producer;
import com.kodilla.good.patterns.challenges.food2door.producer.ProducerInformationService;
import com.kodilla.good.patterns.challenges.food2door.user.User;
import com.kodilla.good.patterns.challenges.food2door.user.UserInformationService;

public class EmailService implements UserInformationService, ProducerInformationService {

    public boolean sendEmail(String to, String body) {
        System.out.println("Sending email: " + body + " to: " + to);
        return true;
    }

    public void informProducer(Producer producer) {
        sendEmail("extra food shop", "email body");
    }

    public void informUser(User user) {
        sendEmail(user.getUsername(), "Dear Mr " + user.getRealName() + "...");
    }
}
