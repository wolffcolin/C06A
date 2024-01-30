
public class Burner {
	
	public enum Tempurature {
		BLAZING, HOT, WARM, COLD;
	}
	
	private Tempurature myTempurature;
	public Setting mySetting;
	int timer;
	public static final int TIME_DURATION = 2;
	
	public Burner() {
		
		this.myTempurature = Burner.Tempurature.COLD;
		
		this.mySetting = Setting.OFF;

		this.timer = 0;
		
	}
	
	public void plusButton() {
		
	}
	
	
}
