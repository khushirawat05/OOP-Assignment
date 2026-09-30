interface Notifiable{
    void sendNotification();
}
class smsNotification implements Notifiable{
    
    public void sendNotification(){
        System.out.println("sending SMS messages");
    }
}
class emailNotification implements Notifiable{
    
    public void sendNotification(){
        System.out.println("Sending email message");

    }
}

public class notification{
    public static void main(String[] args){
        Notifiable sms = new smsNotification();
        Notifiable email = new emailNotification();

        //Anonymous inner class 
        Notifiable push = new Notifiable() {
            public void sendNotification(){
                System.out.println("Sending push notification");
            }
        };
        sms.sendNotification();
        email.sendNotification();
        push.sendNotification();
        
    }
}



    



