package GroupSeeTest.ArtifactSeeTest;
import com.experitest.client.*;

public class LandingPage extends BaseMobilePage {

	protected String zone = "LandingPage";
	public LandingPage(Client _client) {
		super(_client);
	}
	
	public void GoToPayment()
	{
		client.click(zone, "makePaymentButton", 0, 1);
	}

}
