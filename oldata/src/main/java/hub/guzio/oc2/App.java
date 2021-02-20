package hub.guzio.oc2;

public class App implements Mod{

	public String getModID() {return "oc2";}

	@Override
	public void onInitialize() {
		System.out.println("Hello form Opencomputers 2 common side!");
	}
}