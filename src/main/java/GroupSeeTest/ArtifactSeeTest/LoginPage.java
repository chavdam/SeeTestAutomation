package GroupSeeTest.ArtifactSeeTest;
import com.experitest.client.*;

public class LoginPage extends BaseMobilePage {

	protected String loginZone = "LoginScreen";
	public LoginPage(Client _client) {
		super(_client);
	}
	
	public void performLogin(String userName, String password)
	{
		client.click(loginZone, "txtUserName", 0, 1);
        client.sendText(userName);
        client.click(loginZone, "txtPassword", 0, 1);
        client.sendText(password);
        client.click(loginZone, "loginButton", 0, 1);
        
	}

}
