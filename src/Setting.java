/*
 
Class: Setting 
Description: The Setting enum is just an enumerated type for the setting a stove is at. It has the options: OFF LOW
MEDIUM HIGH 
Authors: Colin Wolff and Matt McGrath
Date: 1/29/2024
Collaborators: N/A
Sources: N/A
*/

public enum Setting {
	OFF ("[---].....cooool"), LOW("[--+].....warm"), MEDIUM("[-++].....CAREFUL"), HIGH("[+++].....VERY HOT! DON'T TOUCH");
	private String Value;
	
	Setting(String aValue){ //Constructor for Setting
		this.Value = aValue;
	}
	
	public String toString() { //Returns value of setting
		return Value;
	}
}
