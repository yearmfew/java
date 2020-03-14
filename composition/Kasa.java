public class Kasa{

	private String model;

	private String uretici;

	private String malzeme;

	public Kasa(String model, String uretici, String malzeme){
		this.model 		= model;
		this.uretici 	= uretici;
		this.malzeme 	= malzeme;
	}
	public void bilgisayariAc(){
		System.out.println("bilgisayar aciliyor...");
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

	// get method for malzeme
	public String getMalzeme(){
		return malzeme;
	}
		// set method for malzeme
	public void setMalzeme(String malzeme){
		this.malzeme = malzeme;
	}





}