package ex06;
/**
 *     {
 *      "sends" : [basic, email],
 *       "msg": "반가워!!"
 *     }
 */
import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.SmsNotifier;

// 정의 : 기존에 있는 클래스(속옷)에 기능을 확장하면서 계속 추가하는 패턴
public class App {
    public static void main(String[] args) {
        // Q1. sms, sms, email
        EmailNotifier e1 = new EmailNotifier(new SmsNotifier(new SmsNotifier()));
        e1.send();
        System.out.println("------------------------");
        // Q2. 기본, sms, email
        EmailNotifier e2 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        e2.send();
        System.out.println("------------------------");
        // Q3. sms
        SmsNotifier s1 = new SmsNotifier();
        s1.send();

    }
}
