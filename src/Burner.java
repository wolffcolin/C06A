/*
 
Class: Burner 
Description: The burner class controls the setting of the burner, the temperature of the burner,
and the current time. An enum is used to control the temperature of the class, and is controlled using 
the plusButton() method, the minusButton() method, and the updateTemperature() method. 
Authors: Colin Wolff and Matt McGrath
Date: 1/29/2024
Collaborators: N/A
Sources: N/A
*/

public class Burner {
	
	public enum Temperature {
		BLAZING, HOT, WARM, COLD;
	}
	
	private Temperature myTemperature; //Current temperature of the burner
	public Setting mySetting; //Current setting of the burner
	int timer; //Keeps track of how much time has passed in hours
	
	public static final int TIME_DURATION = 2;
	
	public Burner() { //Constructor for Burner
		
		this.myTemperature = Burner.Temperature.COLD; //Sets temp to cold
		
		this.mySetting = Setting.OFF; //Sets setting to off

		this.timer = 0; //Sets timer to 0
		
	}
	
	public void plusButton() { //Increments the Setting by +1
		switch(mySetting) {
		case HIGH: //If its high, do nothing
			break;
		case MEDIUM:
			mySetting = Setting.HIGH; //If its medium, set to high
			break;
		case LOW: 
			mySetting = Setting.MEDIUM; //If its low, set to medium
			break;
		case OFF:
			mySetting = Setting.LOW; //If its off, set to low
			break;
		}
		timer = TIME_DURATION; //Update timer
	}
	
	public void minusButton() { //Lower the setting by 1
		switch(mySetting) {
		case HIGH: //If its high, set to medium
			mySetting = Setting.MEDIUM;
			break;
		case MEDIUM: //If its medium, set to low
			mySetting = Setting.LOW;
			break;
		case LOW: //If its low, set to off
			mySetting = Setting.OFF;
			break;
		case OFF: //If its off, do nothing
			break;
		}
		timer = TIME_DURATION; //Update timer
	}
	
	public void updateTemperature() { //Updates the temperature to next setting and updates timer
		if (timer > 0) { //If the timer is not at 0, reduce by 1
			timer--;
		}
		
		if (timer == 0) { //If time is set to 0, increment temperature by 1
			switch (mySetting) {
			case HIGH: //If setting is high, set temperature to blazing
				myTemperature = Temperature.BLAZING;
				break;
			case MEDIUM: //If setting is medium, set temperature to hot
				myTemperature = Temperature.HOT;
				break;
			case LOW: //If setting is low, set temperature to warm
				myTemperature = Temperature.WARM;
				break;
			case OFF: //If setting is off, set temperature to cold
				myTemperature = Temperature.COLD;
				break;
			}
			
			timer = TIME_DURATION; //Update timer
		}
		
		
	}
	
	public Temperature getTemperature() { //Getter for temperature
		return myTemperature;
	}
	
	public void display() { //Prints the current setting of the burner
		System.out.println(mySetting.toString());
	}
}
