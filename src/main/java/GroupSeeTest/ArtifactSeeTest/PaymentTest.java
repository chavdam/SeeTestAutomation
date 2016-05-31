package GroupSeeTest.ArtifactSeeTest;

	//package <set your test package>;
	import com.experitest.client.*;
	import org.junit.*;
	/**
	 *
	*/
	public class PaymentTest 
	{
	    private String host = "localhost";
	    private int port = 8889;
	    private String projectBaseDirectory = "C:\\Users\\Mahesh\\workspace\\project2";
	    protected Client client = null;
	    private String appURL = "com.experitest.ExperiBank";

	    @Before
	    public void setUp(){
	        client = new Client(host, port, true);
	        client.setProjectBaseDirectory(projectBaseDirectory);
	        client.setReporter("xml", "reports", "Login");
	        client.setDevice("ios_app:Mahesh's iPhone");
	        client.launch(appURL, true, true);
	    }

	    @Test
	    public void testIfPaymentSuccessful(){
	        LoginPage loginScreen = new LoginPage(client);
	        loginScreen.performLogin("company", "company");
	        LandingPage landingScreen = new LandingPage(client);
	        landingScreen.GoToPayment();
	        MakePaymentPage makePaymentScren = new MakePaymentPage(client);
	        makePaymentScren.SendPayment("609-433-7751", "Mahesh Chavda", "500");
	    }

	    @After
	    public void tearDown(){
	        // Generates a report of the test case.
	        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
	    	client.applicationClose(appURL);
	        client.generateReport(false);
	        // Releases the client so that other clients can approach the agent in the near future. 
	        client.releaseClient();
	    }
	}

