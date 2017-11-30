package com.kodilla.good.patterns.order;

public class MailService implements InformationService {

    public void informOrderSuccess(User user) {
        System.out.println("Mail sent to " + user.getName() + " " + user.getSurname() + ": order accepted.");
    }

    public void informOrderFailure(User user) {
        System.out.println("Mail sent to " + user.getName() + " " + user.getSurname() + ": order rejected.");
    }

}
