

public class abone{
	
	private String isim;
	private int bakiye = 120;
	private String sehir;

	public abone(String isim, int bakiye, String sehir){
		this.isim = isim;

		if(bakiye >=0 && bakiye <= 120){
			this.bakiye = bakiye;
		}
		this.sehir = sehir;

	}

	// get and set for isim
	public String getIsım(){
		return isim;
	}

	public void setIsım(String isim){
		this.isim = isim;
	}

	// get and set for bakiye
	public int getBakiye(){
		return bakiye;
	}

	public void setBakiye(int bakiye){
		if(bakiye >= 0 && bakiye<=120){
			this.bakiye = bakiye;
		}
	}

	// get and set for sehir

	public String getSehir(){
		return sehir;
	} 

	public void setSehir(String sehir){
		this.sehir = sehir;
	}

	// doğalgaz kullanma fonksiyonu
	public void dogalgaz_kullan(int miktar) {
		if ((this.bakiye - miktar) < 0 ) {

			System.out.println("Yeterli Bakiye Yok.");
		}
		else {
			this.bakiye -= miktar;

			if (this.bakiye <= 0) {
				System.out.println("Bakiyeniz bitmiştir. Lütfen en yakın abone merkezine giderek kredi yükleyin"
					+ " Kredi Limiti =  120 TL"
					);

			}
			else {
				System.out.println("Yeni Bakiye = " + bakiye);

			}
		}
	}

	// bakiye öğrenme fonksiyonu
	
	public void bakiye_ogren() {
		System.out.println("Bakiye = " + bakiye);

	}

}