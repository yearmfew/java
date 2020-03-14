
public class Anakart{

	private String model;
	private String uretici;
	private String yuvaSayisi;	
	private String isletimSistemi;

	public Anakart(String model, String uretici, String yuvaSayisi, String isletimSistemi){

		this.model 			= model;
		this.uretici 		= uretici;
		this.yuvaSayisi  	= yuvaSayisi;
		this.isletimSistemi = isletimSistemi;

	}


	public String getModel(){
		return model;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getUretici(){
		return uretici;
	}
	 // set method for uretici
	public void setUretici(String uretici){
		this.uretici = uretici;
	}

	// get method for yuvaSayisi
	public String getYuvaSayisi(){
		return yuvaSayisi;
	}

	// set method for yuvaSayisi
	public void setYuvaSayisi(String yuvaSayisi){
		this.yuvaSayisi = yuvaSayisi;
	}
	// get method for isletimSistemi
	public String getIsletimSistemi(){
		return isletimSistemi;
	}
	// set method for isletimSistemi
	public void setIsletimSistemi(String isletimSistemi){
		this.isletimSistemi = isletimSistemi;
	}

	public void isletimSistemiYükle(String isletimSistemi){
		this.isletimSistemi = isletimSistemi;
		System.out.println("Isletim Sistemi Yüklendi: " + isletimSistemi);
	}



}