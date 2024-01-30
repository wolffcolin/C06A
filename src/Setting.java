
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
