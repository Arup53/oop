public class Main{
    public static void main(String[] args){
        Tacobox tacoPractical= new TripleTacoBox();
        


          // Using EmailService
        NotificationService emailService = new EmailService();
        NotificationSender emailNotifier = new NotificationSender(emailService);
        emailNotifier.sendAlert("user@example.com", "System is down!");

        // Using SMSService
        NotificationService smsService = new SMSService();
        NotificationSender smsNotifier = new NotificationSender(smsService);
        smsNotifier.sendAlert("123-456-7890", "High priority alert!");
    }
}

// -------- Task-1 ----------
interface Tacobox{
    int tacosRemaining();
    void eat();
}

class TripleTacoBox implements Tacobox{
    private int tacos;

    public TripleTacoBox(){
        this.tacos=3;
    }

    public int tacosRemaining(){
        return this.tacos;
    }

    public void eat(){
        if(this.tacos>0){
            this.tacos--;
        }
    }

}

class CustomTacoBox implements Tacobox{
    private int tacos ;
    public CustomTacoBox(int tacos){
        this.tacos=tacos;
    }
    public int tacosRemaining(){
        return this.tacos;
    }

    public void eat(){
        if(this.tacos>0){
            this.tacos--;
        }
    }
}


interface NotificationService {
    void sendMessage(String recipient, String message);
}

class EmailService implements NotificationService {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending email to: " + recipient + " with message: " + message);
        // Actual email sending logic would go here
    }
}

class SMSService implements NotificationService {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending SMS to: " + recipient + " with message: " + message);
        // Actual SMS sending logic would go here
    }
}


class NotificationSender {
    private NotificationService notificationService;

    // Constructor injection: The specific notification service is injected
    public NotificationSender(NotificationService service) {
        this.notificationService = service;
    }

    public void sendAlert(String user, String alertMessage) {
        notificationService.sendMessage(user, alertMessage);
    }

    
}