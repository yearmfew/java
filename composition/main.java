
public class main{
	public static void main (String[] args){
// Write your codes...

		Resolution resolution 	= new Resolution(1920, 1080);
		Monitor monitor 		= new Monitor("VS197DE", "ASUS", "18.5", resolution);

		Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");

		Anakart anakart = new Anakart("B250-Pro", "Asus", "10", "Windows 10");

		Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);

		pc.getKasa().bilgisayariAc(); 
		pc.getMonitor().kapat();
		pc.getAnakart().isletimSistemiYükle("linux Mint");

	}
}