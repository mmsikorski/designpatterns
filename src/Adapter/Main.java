package Adapter;

import Adapter.notifier.AdvancedNotifierImpl;
import Adapter.notifier.Notifier;
import Adapter.notifier.NotifierImpl;

public class Main {

    public static void main(String... args) {

        Notifier notifier = new NotifierImpl();
        //notifier.sendMessage("XXXXX");

        Notifier advancedNotifier = new AdvancedNotifierImpl(notifier);
        advancedNotifier.sendMessage("XXXXX");

    }
}
