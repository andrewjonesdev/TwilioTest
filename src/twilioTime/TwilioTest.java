package twilioTime;

//Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioTest {
// Find your Account Sid and Token at twilio.com/user/account
public static final String ACCOUNT_SID = "AC3e674863086b91d4a48885977cd375cc";
public static final String AUTH_TOKEN = "935959939532b59a79a49ae9046f60ea";

public static void main(String[] args) {
 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

 Message message = Message.creator(new PhoneNumber("+17033045506"), new PhoneNumber("+17032935022"), "Sup Andrew. Testing Twilio").create();

 System.out.println(message.getSid());
 Message messageInc = Message.fetcher(message.getSid()).fetch();
 System.out.println(messageInc.getBody());
}
}