package GroupSeeTest.ArtifactSeeTest;
import com.experitest.client.*;

public class MakePaymentPage extends BaseMobilePage {

	protected String zone = "MakePaymentPage";
	public MakePaymentPage(Client _client) {
		super(_client);
	}
	
	public void SendPayment(String phone, String name, String amount)
	{
		client.click(zone, "phoneTextField", 0, 1);
		client.sendText(phone);
		client.click(zone, "nameTextField", 0, 1);
		client.sendText(name);
		client.click(zone, "amountTextField", 0, 1);
		client.sendText(amount);
		client.click(zone, "countryButton", 0, 1);
		client.click(zone, "USA", 0, 1);
		client.click(zone, "sendPaymentButton", 0, 1);
		client.click(zone, "YesButton", 0, 1);
	}

}
