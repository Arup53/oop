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


// ---------- One class to multiple class communication--------

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


// ------------ without interface ---------- 


//  class EmailService {
//     public void sendEmail(String recipient, String message) {
//         System.out.println("Sending email to: " + recipient + " with message: " + message);
//         // Actual email sending logic would go here
//     }
// }

//  class SMSService {
//     public void sendSMS(String recipient, String message) {
//         System.out.println("Sending SMS to: " + recipient + " with message: " + message);
//         // Actual SMS sending logic would go here
//     }
// }

//  class NotificationSender {
//     // Now we need specific references
//     private EmailService emailService;
//     private SMSService smsService;

//     public NotificationSender() {
//         this.emailService = new EmailService();
//         this.smsService = new SMSService();
//     }

//     public void sendEmailAlert(String user, String alertMessage) {
//         emailService.sendEmail(user, alertMessage);
//     }

//     public void sendSMSAlert(String phone, String alertMessage) {
//         smsService.sendSMS(phone, alertMessage);
//     }

//     public static void main(String[] args) {
//         NotificationSender notifier = new NotificationSender();
//         notifier.sendEmailAlert("user@example.com", "System is down!");
//         notifier.sendSMSAlert("123-456-7890", "High priority alert!");
//     }
// }