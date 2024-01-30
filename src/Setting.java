
public enum Setting {
	OFF ("[---].....cooool"), LOW("[--+].....warm"), MEDIUM("[-++].....CAREFUL"), HIGH("[+++].....VERY HOT! DON'T TOUCH");
	private String Value;
	
	Setting(String aValue){
		this.Value = aValue;
	}
	
	public String toString() {
		return Value;
	}
}
