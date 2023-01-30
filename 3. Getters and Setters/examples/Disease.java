package examples;

public class Disease {

	private String name;//name of Disease
	private boolean curable;

	Disease(String title, boolean isCurable){
		this.name = title;
		this.curable = isCurable;
	}//constructor

	boolean isCurable(){
		return this.curable;
	}//getter isCurable

	String getName(){
		return this.name;
	}//getter getName

	public void setCurable(boolean valueCurable){
		this.curable = valueCurable;
	}//setter setCurable


	
}//class Disease
