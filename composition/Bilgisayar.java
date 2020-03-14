
public class Bilgisayar{

	private Monitor monitor;
	private Kasa kasa;
	private Anakart anakart;

	public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart){
		this.monitor 	= monitor;
		this.kasa 		= kasa;
		this.anakart 	= anakart;

	}

		// get method for monitor
	public Monitor getMonitor(){
		return monitor;
	}

		// set method for monitor
	public void setMonitor(Monitor monitor){
		this.monitor = monitor;
	}	

		// get method for kasa
	public Kasa getKasa(){
		return kasa;
	}	

		// set method for kasa
	public void setKasa(Kasa kasa){
		this.kasa = kasa;
	}

		// get method for anakart
	public Anakart getAnakart(){
		return anakart;
	}

		// set method for anakart
	public void setAnakart(Anakart anakart){
		this.anakart = anakart;
	}



}