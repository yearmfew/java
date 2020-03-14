
public class Monitor{
	private String model;

	private String uretici;

	private String boyut;

	private Resolution resolution;

	public Monitor(String model, String uretici, String boyut, Resolution resolution){

		this.model 	= model;
		this.uretici = uretici;
		this.boyut = boyut;
		this.resolution = resolution;
	}


		// get method for model
	public String getModel(){
		return model;
	}

		// set method for model
	public void setModel(String model){
		this.model = model;
	}
			// get method for uretici
	public String getUretici(){
		return uretici;
	}

			// set method for uretici
	public void setUretici(String uretici){
		this.uretici = uretici;
	}	

	// get method for boyut
	public String getBoyut(){
		return boyut;
	}
	// set method for boyut
	public void setBoyut(String boyut){
		this.boyut = boyut;
	}

	// get method for resolution
	public Resolution getResolution(){
		return resolution;
	}
		// set method for resolution
	public void setResolution(Resolution resolution){
		this.resolution = resolution;
	}

	public void kapat(){
		System.out.println("kapanıyor.....");

	}


}