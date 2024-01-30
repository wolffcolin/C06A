
public enum Setting {
	OFF ("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String Value;
	
	Setting(String aValue){
		this.Value = aValue;
	}
	
	public String toString() {
		return Value;
	}
}
