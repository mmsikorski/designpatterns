package Adapter.notifier;

public class AdvancedNotifierImpl implements Notifier {

    Notifier basicNotifier;

    public AdvancedNotifierImpl(Notifier basicNotifier) {
        this.basicNotifier = basicNotifier;
    }

    public AdvancedNotifierImpl() {
        this.basicNotifier = null;
    }


    @Override
    public void sendMessage(String message) {
        if(this.basicNotifier != null) {
            basicNotifier.sendMessage(message);


            System.out.println("We are using old/basic notifier");
        } else {
            System.out.println("Basic notifier is null");
        }

        this.advancedFuncionalities(message);

    }

    public void advancedFuncionalities(String message) {
        System.out.println("Here is a place to do more advanced funcionalities. ");
        System.out.println("Message sent to other recipents (systems)");
    }
}
