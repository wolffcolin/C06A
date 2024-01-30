
public class Burner {
	
	public enum Temperature {
		BLAZING, HOT, WARM, COLD;
	}
	
	private Temperature myTemperature;
	public Setting mySetting;
	int timer;
	public static final int TIME_DURATION = 2;
	
	public Burner() {
		
		this.myTemperature = Burner.Temperature.COLD;
		
		this.mySetting = Setting.OFF;

		this.timer = 0;
		
	}
	
	public void plusButton() {
		switch(mySetting) {
		case HIGH:
			break;
		case MEDIUM:
			mySetting = Setting.HIGH;
			break;
		case LOW: 
			mySetting = Setting.MEDIUM;
			break;
		case OFF:
			mySetting = Setting.LOW;
			break;
		}
		timer = TIME_DURATION;
	}
	
	public void minusButton() {
		switch(mySetting) {
		case HIGH:
			mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			mySetting = Setting.LOW;
			break;
		case LOW: 
			mySetting = Setting.OFF;
			break;
		case OFF:
			break;
		}
		timer = TIME_DURATION;
	}
	
	public void updateTemperature() {
		if (timer > 0) {
			timer--;
		}
		
		if (timer == 0) {
			switch (mySetting) {
			case HIGH:
				myTemperature = Temperature.BLAZING;
				break;
			case MEDIUM:
				myTemperature = Temperature.HOT;
				break;
			case LOW: 
				myTemperature = Temperature.WARM;
				break;
			case OFF:
				myTemperature = Temperature.COLD;
				break;
			}
			
			timer = TIME_DURATION;
		}
		
		
	}
	
	public Temperature getTemperature() {
		return myTemperature;
	}
	
	public void display() {
		System.out.println(mySetting.toString());
	}
}
