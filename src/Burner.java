
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
		Setting[] setting = Setting.values();
		int nextTemp = (mySetting.ordinal()+1) % setting.length;
		mySetting = setting[nextTemp];
		timer = TIME_DURATION;
	}
	
	public void minusButton() {
		Setting[] setting = Setting.values();
		int nextTemp = (mySetting.ordinal()-1) % setting.length;
		mySetting = setting[nextTemp];
		timer = TIME_DURATION;
	}
	
	public void updateTemperature() {
		timer--;
		
	}
}
