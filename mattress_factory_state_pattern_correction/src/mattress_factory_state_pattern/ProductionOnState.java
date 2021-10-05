package mattress_factory_state_pattern;


public class ProductionOnState implements State {
	 
	MattressFactory mattressFactory;
 
    public ProductionOnState(MattressFactory mattressFactory) {
        this.mattressFactory = mattressFactory;
    }

	@Override
	public void startProduction() {
		System.out.println("Please wait, the machine is being started");
		
	}

	@Override
	public void endProduction() {
		System.out.println("Sorry, you cant stop the machine at the moment");
		
	}
	
	public String toString() {
		return "Starting the mattress factory machine";
	}

}