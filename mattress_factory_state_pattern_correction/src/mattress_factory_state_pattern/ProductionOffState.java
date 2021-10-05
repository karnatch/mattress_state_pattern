package mattress_factory_state_pattern;


public class ProductionOffState implements State {
	 
	MattressFactory mattressFactory;
	
	public ProductionOffState(MattressFactory mattressFactory) {
        this.mattressFactory = mattressFactory;
    }

	@Override
	public void startProduction() {
		System.out.println("Sorry, you cant start the machine at the moment");
		
	}

	@Override
	public void endProduction() {
		System.out.println("Please wait, the machine is being stopped");
		
	}
	
	public String toString() {
		return "The mattress factory machine is shutting down";
	}
}