package Adapter.notifier;

public class NotifierImpl implements Notifier{

    @Override
    public void sendMessage(String message) {

        System.out.println("Message " + message + " was sent");

    }

    public void sendMessageFacebook(String mess) {

    }
}
