
public class Dranza extends Beyblade{
	private String holyBeast;

	public Dranza (String player, int rotSpeed, int attack, String holyBeast){
		super(player, rotSpeed, attack);
		this.holyBeast = holyBeast;
	}


	// get and set for holyBeast

	public String getHolyBeast(){
		return holyBeast;
	}

	public void setHolyBeast(String holyBeast){
		this.holyBeast = holyBeast;
	}

	// kutsal canavar - holy beast
	@Override
	public void holyBeast(){
		System.out.println(getPlayer() + " " + holyBeast + "ortaya çıkıyor...");
		System.out.println(getPlayer() + " gizli saldırısı alev kılıcı...");
	}

	// bilgileri gösteren method
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("Kutsal Canavar Adı: " + holyBeast);
	}

}