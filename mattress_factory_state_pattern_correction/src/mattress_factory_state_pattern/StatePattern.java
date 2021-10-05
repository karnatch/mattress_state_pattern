package mattress_factory_state_pattern;


public class StatePattern {

	public static void main(String[] args) {
		MattressFactory mattressFactory = new MattressFactory(2);

		System.out.println(mattressFactory);

		mattressFactory.startProduction();

		System.out.println(mattressFactory);

		mattressFactory.endProduction();

		System.out.println(mattressFactory);
	}
}
