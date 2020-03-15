class Hayvan{
	private String isim;

	public Hayvan(String isim){
		this.isim = isim;
	}

	// get and set for Hayvan

	public String getIsım(){
		return this.isim;
	}

	public void setIsım(String isim){
		this.isim = isim;
	}

	public String konus(){
		return "hayvan konusuyor";
	}

}

class Kedi extends Hayvan{

	public Kedi (String isim){
		super(isim);
	}
	@Override
	public String konus(){
		return this.getIsım() + " miyavlıyor...";
	}

}



class Kopek extends Hayvan{
	public Kopek(String isim){
		super(isim);
	} 

	@Override 
	public String konus(){
		return this.getIsım() + " havlıyor...";
	}

}

class At extends Hayvan{
	public At(String isim){
		super(isim);
	} 

	@Override 
	public String konus(){
		return this.getIsım() + " kişniyor...";
	}

}


public class main{

	public static void konustur(Hayvan hayvan){
		System.out.println(hayvan.konus());
	}	
	public static void main (String[] args){


		

		konustur(new Kedi("Tekir"));
		konustur(new Kopek("Karabaş"));
		konustur(new At("Şahbatur"));


/*
		Hayvan hayvan1 = new Kedi("limon");
		Hayvan hayvan2 = new Kopek("Karabaş");
		Hayvan hayvan3 = new At("Şahbatur");


		System.out.println(hayvan1.konus());
		System.out.println(hayvan2.konus());
		System.out.println(hayvan3.konus());

*/


	}
}