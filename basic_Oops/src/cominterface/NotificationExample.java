package cominterface;

interface Notification {
    void sendMessage();
}

class Email implements Notification {
    public void sendMessage() {
        System.out.println("Sending Email Notification");
    }
}

class SMS implements Notification {
    public void sendMessage() {
        System.out.println("Sending SMS Notification");
    }
}

public class NotificationExample {
    public static void main(String[] args) {
        Notification n;

        n = new Email();
        n.sendMessage();

        n = new SMS();
        n.sendMessage();
    }
}


