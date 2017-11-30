package com.kodilla.good.patterns.solid;

public class MailService implements InformationService {

    public void informRentAccepted(User user) {
        System.out.println("Mail sent to " + user.getName() + " " + user.getSurname() + ": rental accepted.");
    }

    public void informRentRejected(User user) {
        System.out.println("Mail sent to " + user.getName() + " " + user.getSurname() + ": rental rejected.");
    }

}
