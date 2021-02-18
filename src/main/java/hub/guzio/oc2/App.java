package hub.guzio.oc2;

public class App implements Mod{

	public String getModID() {return "oc2";}

	@Override
	public void onInitialize() {
		System.out.println("Hello form Opencomputers 2 common side!");
	}

	@Override
	public void onInitializeClient() {
		System.out.println("Hello form Opencomputers 2 client side!");
		
	}

	@Override
	public void onInitializeServer() {
		System.out.println("Hello form Opencomputers 2 server side!");
		
	}
}
