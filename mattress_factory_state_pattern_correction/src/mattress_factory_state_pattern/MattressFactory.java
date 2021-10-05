package mattress_factory_state_pattern;

public class MattressFactory {
	 
	State productionOnState;
	State productionOffState;
 
	State state;
	int count = 0;
 
	public MattressFactory(int numberMatts) {
		productionOnState = new ProductionOnState(this);
		productionOffState = new ProductionOffState(this);

		this.count = numberMatts;
 		if (numberMatts > 0) {
			state = productionOnState;
		} else {
			state = productionOffState;
		}
	}
 
	public void startProduction() {
		state.startProduction();
	}
 
	public void endProduction() {
		state.endProduction();
	}
 
	

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getProductionOnState() {
        return productionOnState;
    }

    public State getProductionOffState() {
        return productionOffState;
    }

}