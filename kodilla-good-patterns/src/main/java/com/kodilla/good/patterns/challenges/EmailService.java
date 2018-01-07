package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {
    public void inform(User user) {
        System.out.println("Sending a confirmation email to: " + user.getName() + " " + user.getSurname());
    }
}
